package ecomm_saipratap;


	import org.openqa.selenium.By;
  
	import org.testng.Assert;
	import org.testng.annotations.Test;

    import ecomm_saipratap.core.LoginBaseTest;
	public class LoginTest extends LoginBaseTest implements LoginConstant{
			
		  @Test 
		  public void testWithSuccessLogin() throws InterruptedException{
		  driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys("user1234");
		  driver.findElement(By.name( PASSWORD_NAME_LOCATOR)).sendKeys("pwd1");
		  driver.findElement(By.linkText(LOGIN_BTN_LINK_TEXT_LOCATOR)).click();
		  Thread.sleep(2000);
		  Assert.assertEquals(driver.getCurrentUrl(), "http://ecommerce.saipratap.net/thankyoumessage.php?msg=login");
		  }
		  @Test
		  public void testWithBlankLogin() throws InterruptedException{
		  driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys(" ");
		  driver.findElement(By.name( PASSWORD_NAME_LOCATOR)).sendKeys("pwd1");
		  driver.findElement(By.linkText(LOGIN_BTN_LINK_TEXT_LOCATOR)).click();
		  Thread.sleep(2000);
		  //Assert.assertEquals(driver.getCurrentUrl(), "http://ecommerce.saipratap.net/thankyoumessage.php?msg=login");
		  }
		  @Test
		  public void testWithBlankPassword()throws InterruptedException{
		  driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys("user1234");
		  driver.findElement(By.name( PASSWORD_NAME_LOCATOR)).sendKeys(" ");
		  driver.findElement(By.linkText(LOGIN_BTN_LINK_TEXT_LOCATOR)).click();
		  Thread.sleep(2000);
		  //Assert.assertEquals(driver.getCurrentUrl(), "http://ecommerce.saipratap.net/thankyoumessage.php?msg=login");
		  }
		  @Test
		  public void testWithBothBlank() throws InterruptedException{
		  driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys(" ");
		  driver.findElement(By.name( PASSWORD_NAME_LOCATOR)).sendKeys(" ");
		  driver.findElement(By.linkText(LOGIN_BTN_LINK_TEXT_LOCATOR)).click();
		  Thread.sleep(2000);
		  //Assert.assertEquals(driver.getCurrentUrl(), "http://ecommerce.saipratap.net/thankyoumessage.php?msg=login");
		  }
		  @Test
		  public void testWithInvalidLogin() throws InterruptedException {
		  driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys("user12345");
		  driver.findElement(By.name( PASSWORD_NAME_LOCATOR)).sendKeys("pwd1");
		  driver.findElement(By.linkText(LOGIN_BTN_LINK_TEXT_LOCATOR)).click();
		  Thread.sleep(2000);
		  //Assert.assertEquals(driver.getCurrentUrl(), "http://ecommerce.saipratap.net/thankyoumessage.php?msg=login");
		  }
		 

}
