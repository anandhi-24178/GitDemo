package ecomm_saipratap;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends RegistrationBaseTest implements RegistrationConstants{
	
	
	@Test
	public void testWithSuccessRegistration() throws InterruptedException{
	driver.findElement(By.linkText(SIGN_UP_LINK_TEXT_LOCATOR)).click();	
	WebElement w = driver.findElement(By.cssSelector("input[name='radiobutton'][value='2']"));
	w.click();
	driver.findElement(By.name(FNAME_NAME_LOCATOR)).sendKeys("java");
	driver.findElement(By.name(LNAME_NAME_LOCATOR)).sendKeys("novie");
	driver.findElement(By.name(DAY_NAME_LOCATOR)).sendKeys("22");
	driver.findElement(By.name(MONTH_NAME_LOCATOR)).sendKeys("12");
	driver.findElement(By.name(YEAR_NAME_LOCATOR)).sendKeys("2000");
	driver.findElement(By.name(EMAIL_NAME_LOCATOR)).sendKeys("alder11@yahoo.com");
	driver.findElement(By.name(HOUSENO_NAME_LOCATOR)).sendKeys("222");
	driver.findElement(By.name(ADD1_NAME_LOCATOR)).sendKeys("ensenada street");
	driver.findElement(By.name(CITY_NAME_LOCATOR)).sendKeys("san ramon");
	driver.findElement(By.name(PHONE_NAME_LOCATOR)).sendKeys("4083334433");
	Thread.sleep(2000);
	driver.findElement(By.name(PASSWORD_NAME_LOCATOR)).sendKeys("helloworld12");
	driver.findElement(By.name(CPASSWORD_NAME_LOCATOR)).sendKeys("helloworld12");
	
	driver.findElement(By.cssSelector(TERMS_NAME_LOCATOR)).click();
	Thread.sleep(3000);
	driver.findElement(By.name(SUBMIT_BTN_NAME_LOCATOR)).click();
	//String str = "java";
	//Assert.assertEquals(w.isSelected(), "true");
	
	
	Assert.assertEquals(driver.getCurrentUrl(), "http://ecommerce.saipratap.net/thankyoumessage.php?msg=reg");
	}
	@Test
	public void testWithPasswordAndConfirmpassword()throws InterruptedException {
	driver.findElement(By.linkText(SIGN_UP_LINK_TEXT_LOCATOR)).click();	
	WebElement pass = driver.findElement(By.name(PASSWORD_NAME_LOCATOR));
	pass.sendKeys("selenium");
	WebElement cpass = driver.findElement(By.name(CPASSWORD_NAME_LOCATOR));
	cpass.sendKeys("selenium");
	Assert.assertEquals(pass.getText(), cpass.getText());
	}
	/*public void testWithSignUpButton() throws InterruptedException{
		driver.findElement(By.name("Submit")).click() ;
        Thread.sleep(2000);     
        Assert.assertEquals(driver.getCurrentUrl(),"" );
	}*/
	/*@Test
	public void testTermsCheckbox() throws InterruptedException{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.manage().window().maximize();
	js.executeScript("window.scrollBy(0,1000)");
	WebElement terms = driver.findElement(By.id("terms"));
	Thread.sleep(4000);
	Assert.assertEquals(terms.isSelected(), "false");
	}*/
	
}