package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.utility.nullability.NeverNull.ByDefault;

public class Home_Page {

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//span[contains(@class,'BaseBadge-badge MuiBadge')]")
	private WebElement accountSetting;
	
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutButton;
	
	
	@FindBy(id = "cart")
	private WebElement cartBtn;
	
	@FindBy(xpath = "//h1[text()='Featured Products']")
	private WebElement featuredProduct;
	
	public WebElement getFeaturedProduct() {
		return featuredProduct;
	}

	//@FindBy(xpath = "//span[text()='FASHION2WEAR ']/../../../div[3]/div[2]")
	@FindBy(xpath = "//button[@id='addToCart']")
	private WebElement addToCartBtn;

	public WebElement getAccountSetting() {
		return accountSetting;
	}

	public WebElement getMyprofile() {
		return myProfile;
	}

	public WebElement getLogoutbutton() {
		return logoutButton;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public void setCartBtn(WebElement cartBtn) {
		this.cartBtn = cartBtn;
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public void setAddToCartBtn(WebElement addToCartBtn) {
		this.addToCartBtn = addToCartBtn;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	
	
	
}
