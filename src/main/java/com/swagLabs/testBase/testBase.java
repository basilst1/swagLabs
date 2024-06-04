package com.swagLabs.testBase;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {

	public static WebDriver driver;

	public void initialization() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "edge.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
//
//		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputFile.FILE);
//		FileUtils.copyFile(screenshotfile, new File(".//screenshot/screen.png"));

	}

	public void tearDown() {
		driver.close();

	}
}
