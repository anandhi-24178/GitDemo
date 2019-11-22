package com.apex.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.samples.core.ApexBaseTest;
public class GoogleLoginPage_Testng extends ApexBaseTest implements GoogleLoginConstant{
		@Test
		public void testWithSuccessData() throws InterruptedException{
		//set test data
		WebElement searchElm = driver.findElement(By.name(QUERY_NAME_LOCATOR));
		searchElm.sendKeys(SEARCH_KEYWORD);
		Thread.sleep(2000);
		//click button
		driver.findElement(By.name(BTN_SEARCH_NAME_LOCATOR)).click();
		Thread.sleep(2000);
		//verify results
		Assert.assertEquals(driver.getTitle(), GOOGLE_SEARCH_TITLE);
		}
		@Test
		public void testWithBlankData() {
			
		}
		@Test
		public void testWithNumbers() {
			
		}
		@Test
		public void testWithCharacters() {
			
		}
}
