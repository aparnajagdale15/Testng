package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelMethods {
	//ThreadLocal for parallel execution
	ThreadLocal<WebDriver>driver=new ThreadLocal<>();
	
	@Test
	public void FirefoxTest() throws InterruptedException {
		driver.set(new FirefoxDriver());
		
		driver.get().get("https://www.saucedemo.com/");
		driver.get().findElement(By.id("user-name")).sendKeys("standard_user");
		driver.get().findElement(By.id("password")).sendKeys("secret_sauce");
		driver.get().findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.get().quit();
	}
	
	@Test
	public void ChromeTest() throws InterruptedException {
		driver.set(new ChromeDriver());
		
		driver.get().get("https://www.saucedemo.com/");
		driver.get().findElement(By.id("user-name")).sendKeys("standard_user");
		driver.get().findElement(By.id("password")).sendKeys("secret_sauce");
		driver.get().findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.get().quit();
		
		
	}

}
