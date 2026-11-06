package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotations {
	public String baseUrl="https://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox Browser");
		driver=new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	@Test
	public void verifyHomepageTitle() throws InterruptedException {
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("This is testcase1");
	}
	
	@Test
	public void verifyRegisterTitle() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		String expTitle = "Register: Mercury Tours";
		String actTitle = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actTitle, expTitle);	
		System.out.println("This is testcase2");
	}
	
	@AfterTest
	public void terminateBrowser(){
	System.out.println("Closing the browser...");
	driver.close();
	}
	

}
