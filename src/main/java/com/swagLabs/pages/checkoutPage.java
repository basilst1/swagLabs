package com.swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pages.AddAddressPage;
import com.swagLabs.testBase.testBase;

public class checkoutPage extends testBase {

	public void yourCart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "checkout")
	WebElement checkoutPage;

	public void goToCheckout() {
		checkoutPage.click();
	}

}
