package com.ShoppersStack_TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.GU.Base_Test;
import com.ShoppersStack.pom.Cart_Page;
import com.ShoppersStack.pom.ConfirmPOrderPage;
import com.ShoppersStack.pom.DeleverAddressPage;
import com.ShoppersStack.pom.Payment_Page;

public class Tc_003_verifyUserAbleTo_OrderProduct extends Base_Test {

	
	@Test
	public void orderProduct() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		
		webDriverUtility.javaScript(driver, homepage.getFeaturedProduct());
		Thread.sleep(3000);
		homepage.getAddToCartBtn().click();
		homepage.getCartBtn().click();
		Thread.sleep(3000);
		Cart_Page cartPage =new Cart_Page(driver);
		cartPage.getBuyNowBtn().click();
		
		DeleverAddressPage addresspage = new DeleverAddressPage(driver);
		addresspage.getAddressRB().click();
		Thread.sleep(1000);
		webDriverUtility.javaScript(driver, addresspage.getProceedBtn());
		addresspage.getProceedBtn().click();
		Thread.sleep(3000);
		Payment_Page paymentpage = new Payment_Page(driver);
		paymentpage.getCashOndelevery().click();
		paymentpage.getProceedBtn().click();
		
		ConfirmPOrderPage confirmOrderPAge = new ConfirmPOrderPage(driver);
		//confirmOrderPAge.getOrderConfirm();
		
		Thread.sleep(3000);
		webDriverUtility.takeWebPageScreenshot(driver);
		
	}
}
