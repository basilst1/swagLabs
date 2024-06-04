package com.swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swagLabs.testBase.testBase;

public class paymentInformationPage extends testBase {

	public void checkoutInformation() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first-name")
	WebElement firstName;

	@FindBy(id = "last-name")
	WebElement lastName;

	@FindBy(id = "postal-code")
	WebElement postalCode;

	@FindBy(id = "continue")
	WebElement continueBtn;

	public void firstName(String first) {
		firstName.sendKeys("Basil");
	}

	public void lastName(String last) {
		lastName.sendKeys("Thomas");

	}

	public void postalCode(String postal) {
		postalCode.sendKeys("L4M5T4");

	}

	public void submitBtn() {
		continueBtn.click();
	}

	public void SubmitInformation(String first, String last, String postal) {

		firstName("Basil");
		lastName("Thomas");
		postalCode("T4E5T4");
		continueBtn.click();

	}

}
