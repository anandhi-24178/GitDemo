package com.apex.samples;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class GoogleLoginPage {
			public static void main(String[] args){
				System.setProperty("webdriver.chrome.driver","E:\\anandhi\\chrome\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com/");
				//Thread.sleep(2000);
				WebElement searchElm = driver.findElement(By.name("q"));
				searchElm.sendKeys("Java book");
				//Thread.sleep(2000);
				driver.findElement(By.name("btnK")).click();
				//Thread.sleep(2000);
				
				if(driver.getTitle().equals("Google")) {
					System.out.println("test passed");
				}else {
					System.out.println("test failed");
					
					
				}
				driver.close();
			}

		




}
