package testngListner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

@Listeners(ListnerTestng.class)
public class TestNG {
	WebDriver driver=new ChromeDriver();
	
	@Test//SuccessTest
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test//FailedTest
	public void OpenBrowser() {
		driver.get("https://www.demoqa.com/");
		String expectedTitle = "FreeQAAutomationToolsForEveryone";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
	}

	 private int i = 1;

	    @Test(successPercentage = 60, invocationCount = 3)
	    public void accountTest() {

	        if (i == 1) {
	            Assert.fail("Failing first invocation");
	        }

	        i++;
	        Assert.assertTrue(true);
	    }

	@Test // SkipTest
	public void SkipTest() {
		throw new SkipException("SkippingTheTestMethod");
	}
		
	
	

}
