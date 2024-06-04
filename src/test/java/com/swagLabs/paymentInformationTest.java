package com.swagLabs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.swagLabs.pages.paymentInformationPage;
import com.swagLabs.testBase.testBase;

public class paymentInformationTest extends testBase {
	paymentInformationPage paymentInfoPage;

	@BeforeMethod
	public void launchBrowser() {
		initialization();

	}

	@Test

	public void validateUserInformation() {

		paymentInfoPage.SubmitInformation("Basil", "Thomas", "L4M5T4");

	}

}
