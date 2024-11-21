package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
	public Cart_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id = "buynow_fl")
	private WebElement buyNowBtn;
	
	@FindBy(xpath = "(//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text')])[1]")
	private WebElement removeFromCartBtn;
	
	@FindBy(xpath = "//span[text()='Continue Shopping']")
	private WebElement continueShoppingBtn;

	public WebElement getBuyNowBtn() {
		return buyNowBtn;
	}

	public WebElement getRemoveFromCartBtn() {
		return removeFromCartBtn;
	}

	public WebElement getContinueShoppingBtn() {
		return continueShoppingBtn;
	}
	
	
	
	
	
	
	
	
}
