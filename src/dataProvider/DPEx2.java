package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPEx2 {
	
	@Test(dataProvider="testdata")
	public void TestChrome(String uname,String password) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Load application
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(500);
		driver.close();
		}
		
		@DataProvider(name="testdata")
		public Object[][] TestDataFeed(){
		// Create object array with 3 rows and 2 column- first parameter is row and second is column
		Object[][] twitterdata=new Object[3][2];
		
		// Enter data to row 0 column 0
		twitterdata[0][0]="username1@gmail.com";
		// Enter data to row 0 column 1
		twitterdata[0][1]="Password1";
		// Enter data to row 1 column 0
		twitterdata[1][0]="username2@gmail.com";
		// Enter data to row 1 column 0
		twitterdata[1][1]="Password2";
		twitterdata[2][0]="username3@gmail.com";
		// Enter data to row 1 column 0
		twitterdata[2][1]="Password3";
		
		// return arrayobject to testscript
		return twitterdata;
		}
		/*return new Object[][]
		{
		{"00","01"},
		{"10","11"},
		{"20","21"}
		};*/

}
