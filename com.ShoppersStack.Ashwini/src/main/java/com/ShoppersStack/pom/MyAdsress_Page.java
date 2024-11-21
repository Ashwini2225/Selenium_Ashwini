package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAdsress_Page {
	
	public MyAdsress_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAdressBtn;
	
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startI')])[2]")
	private WebElement deletebtn;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;

	public WebElement getAddAdressBtn() {
		return addAdressBtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	
//	

}
