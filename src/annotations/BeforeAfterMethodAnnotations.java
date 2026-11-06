package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotations {
	public String baseUrl="https://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.out.println("launching firefox browser");
		driver= new FirefoxDriver();
		driver.get(baseUrl);
		Thread.sleep(2000);
		System.out.println("Before Test");
		}
		
		@BeforeMethod
		public void verifyHomepageTitle() throws InterruptedException {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Before Method");
		}
		
		@Test(priority = 0)
		public void register() throws InterruptedException{
		driver.findElement(By.linkText("REGISTER")).click() ;
		String expected = "Register: Mercury Tours";
		String actual = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		System.out.println("Testcase1");
		}
		
		@Test(priority = 1)
		public void support() throws InterruptedException {
		driver.findElement(By.linkText("SUPPORT")).click() ;
		String expected = "Under Construction: Mercury Tours";
		String actual = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		System.out.println("Testcase2");
		}
		
		@AfterMethod
		public void goBackToHomepage ( ) throws InterruptedException {
		driver.findElement(By.linkText("Home")).click() ;
		Thread.sleep(2000);
		System.out.println("After Method");
		}
		
		@AfterTest
		public void terminateBrowser(){
		driver.close();
		System.out.println("After test");
		}

}
