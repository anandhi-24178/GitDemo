package ecomm_saipratap;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrderTest extends PlaceOrderBaseTest implements PlaceOrderConstants{
	
	

	@Test
	public void placeOrderWithSuccessData() {
	driver.findElement(By.linkText(PRODUCTS_LINK_TEXT_LOCATOR)).click();
	driver.findElement(By.xpath(VIEWITEM_LINK_LOCATOR)).click();
	driver.findElement(By.xpath(ADD_TO_CART_LINK_LOCATOR)).click();
	driver.findElement(By.xpath(CHECK_OUT_LINK_LOCATOR)).click();
	driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys("user1234");
	driver.findElement(By.name( PASSWORD_NAME_LOCATOR)).sendKeys("pwd1");
	driver.findElement(By.linkText(LOGIN_BTN_LINK_TEXT_LOCATOR)).click();	
	String str = driver.findElement(By.xpath(PERSONAL_DETAILS_TEXT_LOCATOR)).getText();
	Assert.assertEquals(str, "Personal Details");
	}
	/*@Test
	public void placeOrderWithSuccessDataEndToEnd() throws InterruptedException{
	driver.findElement(By.linkText(PRODUCTS_LINK_TEXT_LOCATOR)).click();
	driver.findElement(By.xpath(VIEWITEM_LINK_LOCATOR)).click();
	driver.findElement(By.xpath(ADD_TO_CART_LINK_LOCATOR)).click();
	driver.findElement(By.xpath(CHECK_OUT_LINK_LOCATOR)).click();
	driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys("user1234");
	driver.findElement(By.name( PASSWORD_NAME_LOCATOR)).sendKeys("pwd1");
	driver.findElement(By.linkText(LOGIN_NAME_LOCATOR)).click();//WebElement welcome_text = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div"));
	Thread.sleep(3000);
	driver.findElement(By.xpath(CONTINUE_LINK_LOCATOR)).click();
	driver.findElement(By.cssSelector(RADIO_BTN_LOCATOR)).click();
	driver.findElement(By.xpath(CONTINUE_ON_POSTAGE_PAGE_LINK_LOCATOR)).click();
	driver.findElement(By.xpath(CONTINUE_ON_PAY_PAGE_LINK_LOCATOR)).click();
	driver.findElement(By.xpath(CONTINUE_ON_DISCOUNT_CODES_PAGE_LINK_LOCATOR)).click();
	driver.findElement(By.name(SUBMIT_BTN_LOCATOR)).click();
	Thread.sleep(3000);
	//Assert.assertEquals();
	}
	@Test 
	public void navigateProductsAndVerifyText() {
	driver.findElement(By.xpath("//*[@id=\"rightcontent\"]/p[2]/a")).click();
	WebElement head_text = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td[2]/div"));
	Assert.assertEquals(head_text.getText(), "Product Detail");
	}
	/*@Test
	public void verifyUrlOfProductDetail() {
	driver.findElement(By.xpath("//*[@id=\"leftcontent\"]/p[2]/a")).click();	
	Assert.assertEquals(driver.getCurrentUrl(),"http://ecommerce.saipratap.net/proddetail.php?proid=10004");
	}*/
}
