package AnnotationAttributes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Timeout {
	
	@Test(timeOut=200)
	public void testcase1() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("This is test case1");
	}
	
	@Test
	 public void testcase2() {
		System.out.println("This is test case2");
	}
	
	@Ignore @Test
	 public void testcase3()
	 {
	 System.out.println("This is testcase3");
	 }
	
	
	

}
