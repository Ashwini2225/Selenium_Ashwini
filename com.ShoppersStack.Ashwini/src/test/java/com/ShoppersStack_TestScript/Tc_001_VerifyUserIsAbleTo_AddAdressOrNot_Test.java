package com.ShoppersStack_TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack.GU.Base_Test;
import com.ShoppersStack.pom.AdressForm_Page;
import com.ShoppersStack.pom.MyAdsress_Page;
import com.ShoppersStack.pom.MyProfile_Page;

public class Tc_001_VerifyUserIsAbleTo_AddAdressOrNot_Test extends Base_Test {
	
	@Test
	public void addAdress() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		Thread.sleep(3000);
		homepage.getAccountSetting().click();
		homepage.getMyprofile().click();
		
		MyProfile_Page myprofilePage = new MyProfile_Page(driver);
		myprofilePage.getMyAdress().click();
		
		Thread.sleep(3000);
		
		MyAdsress_Page myadresspage = new MyAdsress_Page(driver);
		myadresspage.getAddAdressBtn().click();
		
		AdressForm_Page adressformpage = new AdressForm_Page(driver);
		adressformpage.getHome().click();
		
		adressformpage.getName().sendKeys(fileutility.readExcelData("Sheet1", 1, 0));
		adressformpage.getHouseInfo().sendKeys(fileutility.readExcelData("Sheet1", 1,1));
		adressformpage.getStreetInfo().sendKeys(fileutility.readExcelData("Sheet1", 1, 2));
		adressformpage.getLandMark().sendKeys(fileutility.readExcelData("Sheet1", 1, 3));
		
		webDriverUtility.selectByValue(adressformpage.getCountryDD(),fileutility.readPropertyData("country"));
		String state = fileutility.readPropertyData("state");
		System.out.println(state);
		adressformpage.getStateDD().sendKeys(state);
		webDriverUtility.selectByValue(adressformpage.getCityDD(), fileutility.readPropertyData("city"));
		
		adressformpage.getPincode().sendKeys(fileutility.readExcelData("Sheet1", 1, 4));
		adressformpage.getPhoneNumber().sendKeys(fileutility.readExcelData("sheet1", 1, 5));
		adressformpage.getAdressBtn().click();
		
		Thread.sleep(5000);
		webDriverUtility.takeWebPageScreenshot(driver);
		
	
	}

}
