package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPOrderPage {

	public ConfirmPOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//h1[text()='Order Confirmed']")
	private WebElement orderConfirm;

	public WebElement getOrderConfirm() {
		return orderConfirm;
	}
	
	
}

