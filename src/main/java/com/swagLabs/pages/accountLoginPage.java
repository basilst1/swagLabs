package com.swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pages.MyAccountPage;
import com.swagLabs.testBase.testBase;

public class accountLoginPage extends testBase {

	public void AccountLoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement loginInput;

	@FindBy(id = "password")
	WebElement pwdInput;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	public void enterUsername(String userName) {
		loginInput.sendKeys(userName);
	}

	private void enterPassword(String password) {
		pwdInput.sendKeys(password);
	}

	private void clickLoginButton() {
		loginBtn.click();

	}

//	public accountLoginPage submitLoginSwag(String userName, String pwd) {
//		enterUserName(userName);
//		enterPwd(pwd);
//		clickLogin();
//		return null;
//	}

}
