package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstCode {
	public String baseUrl = "https://demo.guru99.com/test/newtours/";
	
	@Test
	public void verifyHomepageTitle() throws InterruptedException {
	System.out.println("launching Chrome browser");
	WebDriver driver=new ChromeDriver();
	driver.get(baseUrl);
	Thread.sleep(1000);
	String expectedTitle="Welcome: Mercury Tours";
	String actualTitle= driver.getTitle();
	System.out.println(actualTitle);
	Assert.assertEquals(actualTitle, expectedTitle);
	driver.close();
}

}
