package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	
	public Payment_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "(//input[contains(@class,'PrivateSwitchBase-input css-1m9pwf3')])[2]")
	private WebElement cashOndelevery;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedBtn;

	public WebElement getCashOndelevery() {
		return cashOndelevery;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}
	
	
}
