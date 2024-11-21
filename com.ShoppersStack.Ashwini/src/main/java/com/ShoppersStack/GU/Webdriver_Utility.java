package com.ShoppersStack.GU;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_Utility {
	JavaUtility javaUtility = new JavaUtility();
	
	public void selectByValue(WebElement element , String value) 
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void takeWebPageScreenshot(WebDriver driver) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWork_Constant.screenshotPath+javaUtility.localDateTime()+".png");
		FileHandler.copy(temp, dest);
		
	}

	public void takeWebElementScereenshot(WebElement element) throws IOException 
	{
		File temp = element .getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWork_Constant.screenshotPath+javaUtility.localDateTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	public void scrollToelement(WebDriver driver , WebElement element) {
	Actions a = new Actions(driver);
	a.scrollToElement(element);
	
	
	}
	
	public void javaScript(WebDriver driver , WebElement ele) {
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
	
	}
}
