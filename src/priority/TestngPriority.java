package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngPriority {
	WebDriver  driver;
	
	@Test (priority=1)
	public void openBrowser() {
	driver = new EdgeDriver();
	}
	
	@Test (priority=2)
	public void launchGoogle() {
	driver.get("http://www.google.co.in");
	}
	
	@Test (priority=3)
	public void peformSeachAndClick1stLink() throws InterruptedException {
	driver.findElement(By.xpath("//textarea[@id='ti6dpd']")).sendKeys("Facebook");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	Thread.sleep(1000);
	}
	
	@Test (priority=4)
	public void FaceBookPageTitleVerification() {
	String actualTitle=driver.getTitle();
	Assert.assertEquals(actualTitle.contains("Facebook"),true);
	driver.close();
	}

}
