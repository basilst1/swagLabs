package com.swagLabs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;

	public void sortProductsByLowToHighPrice() {
		driver.findElement(By.cssSelector("#header_container>div.header_secondary_container>div>span>select")).click();
		driver.findElement(By.xpath("//option[text()='Price (low to high)']")).click();
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select")
	WebElement sortBtn;

	@FindBy(xpath = ("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"))
	WebElement lowToHigh;

	private WebElement addProductToCart;

	public void addProductToCart() {

		@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
		WebElement addProductToCart;

	}

	private void clickAddToCart() {
		addProductToCart.click();

	}

	public void goToCart() {
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
	}

}
