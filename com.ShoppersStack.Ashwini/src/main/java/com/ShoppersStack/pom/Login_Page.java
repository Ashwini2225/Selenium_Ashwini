package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="Email")
	private WebElement Email_TextField ;
	
	
	@FindBy(id="Password")
	private WebElement passwordText;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	public WebElement getEmail_TextField() {
		return Email_TextField;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
	
	
	
	
	
	

}
