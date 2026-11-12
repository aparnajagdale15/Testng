package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngAssertions {
	
	@Test
	public void testOne()
	{
		Assert.assertTrue(true,"Assert failed as the actual condition is False");
		
	}
	
	@Test
	public void testTwo()
	{
		Assert.assertFalse(false,"Assert failed as the condition is True");
	}
	
	@Test
	public void testThree()
	{
		String s="Krishna";
		Assert.assertNotNull(s,"Assert failed as the String is Null");
	}
	
	@Test
	public void testFour()
	{
		String s=null;
		Assert.assertNull(s,"Assert failed as the String is Not Null");
	}
	
	@Test
	public void testFive()
	{
		String s1="Krishna";
		String s2="Krishna";
		Assert.assertEquals(s1,s2,"Assert failed as the two string are Not Equal");
	}
	
	@Test
	public void testSix()
	{
		String s1="Krishna";
		String s2="Aparna";
		Assert.assertNotEquals(s1,s2,"Assert failed as the two String are Equal");
	}
	

}
