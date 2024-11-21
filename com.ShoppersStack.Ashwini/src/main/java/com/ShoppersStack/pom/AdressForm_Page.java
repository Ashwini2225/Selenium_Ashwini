package com.ShoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdressForm_Page {

	public AdressForm_Page(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="Home")
	private WebElement home;
	
	@FindBy(id ="Name" )
	
	private WebElement name;
	
	@FindBy(id = "House/Office Info")
	private WebElement houseInfo;
	
	@FindBy(id="Street Info")
	private WebElement streetInfo;
	
	@FindBy(id="Landmark")
	private WebElement landMark;
	
	@FindBy(id="Country")
	private WebElement countryDD;
	
	@FindBy(id="State")
	private WebElement stateDD;
	
	public WebElement getStateDD() {
		return stateDD;
	}

	@FindBy(id="City")
	private WebElement cityDD;
	
	@FindBy(id = "Pincode")
	private WebElement pincode;
	
	@FindBy(id = "Phone Number")
	private WebElement phoneNumber;
	
    @FindBy(xpath  = "//button[text()='Add Address']")
    private WebElement adressBtn;

	public WebElement getHome() {
		return home;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getHouseInfo() {
		return houseInfo;
	}

	public WebElement getStreetInfo() {
		return streetInfo;
	}

	public WebElement getLandMark() {
		return landMark;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getAdressBtn() {
		return adressBtn;
	}
	
	
	
	
}
