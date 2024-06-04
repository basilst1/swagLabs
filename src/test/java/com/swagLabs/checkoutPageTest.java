package com.swagLabs;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swagLabs.pages.checkoutPage;
import com.swagLabs.testBase.testBase;

public class checkoutPageTest extends testBase {

	checkoutPage CheckoutPage;

	@BeforeMethod
	public void launchBrowser() throws IOException {
		initialization();
	}

	@Test

	public void validateGoToCheckoutPageFunction() {
		checkoutPage page = new checkoutPage();

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
