package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FalseAssertions {
	
	@Test
	public void testOne()
	{
		Assert.assertTrue(false,"Assert failed as the actual condition is False");
	}
	
	@Test
	public void testTwo()
	{
		Assert.assertFalse(true,"Assert failed as the actual condition is True");
	}
	
	@Test
	public void testThree()
	{
		String s=null;
		Assert.assertNotNull(s,"Assert failed as the String is Null");
		
	}
	
	@Test
	public void testFour()
	{
		String s="Krishna";
		Assert.assertNull(s,"Assert failed as the String is NotNull");
	}
	
	@Test
	public void testFive()
	{
		String s1="Krishna";
		String s2="Aparna";
		Assert.assertEquals(s1, s2,"Assert failed as the two String are NotEqual");
	}
	
	@Test
	public void testSix()
	{
		String s1="Krishna";
		String s2="Krishna";
		Assert.assertNotEquals(s1,s2,"Assert failed as the two String are Equal");
	}
	

}
