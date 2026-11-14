package testngParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {
	@Test
	@Parameters({"a","b"})
	public void multiply(int c, int d)
	{
		int m=c*d;
		System.out.println("Multiply of two numbers:" +m);
	}

}
