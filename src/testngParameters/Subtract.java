package testngParameters;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Subtract {
	@Test
	@Parameters({"a","b"})
	public void subtract(int c, int d)
	{
		int sub=c-d;
		System.out.println("diffrence of two numbers: " +sub);
	}

}
