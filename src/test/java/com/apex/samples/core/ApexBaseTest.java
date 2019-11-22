package com.apex.samples.core;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApexBaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver","E:\\anandhi\\chrome\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://ecommerce.saipratap.net/customerlogin.php");
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
	}

}
