package com.ShoppersStack_TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.GU.Base_Test;
import com.ShoppersStack.pom.MyAdsress_Page;
import com.ShoppersStack.pom.MyProfile_Page;

public class Tc_002_VerifyUserAbleTo_DeleteAdress_Test extends Base_Test {

	
	@Test
	public void deleteAdress() throws InterruptedException, IOException 
	{
		homepage.getAccountSetting().click();
		homepage.getMyprofile().click();
		
		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAdress().click();
		
		Thread.sleep(3000);
		
		MyAdsress_Page myadresspage = new MyAdsress_Page(driver);
		myadresspage.getDeletebtn().click();
		Thread.sleep(3000);
		myadresspage.getYesBtn().click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		webDriverUtility.takeWebPageScreenshot(driver);
		
	}
}
