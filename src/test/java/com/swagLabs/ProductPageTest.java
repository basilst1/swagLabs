package com.swagLabs;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swagLabs.pages.ProductPage;
import com.swagLabs.testBase.testBase;

import junit.framework.Assert;

public class ProductPageTest extends testBase {

	ProductPage productPageTest;

	@BeforeMethod
	public void launchBrowser() throws IOException {
		initialization();
	}

	@Test

	public void validateProductAddToCartFunction() {
		ProductPageTest page = new ProductPageTest();

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
