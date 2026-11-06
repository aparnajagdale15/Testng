package priority;

import org.testng.annotations.Test;

public class NoPriority {
	
	@Test
	public void c_method() {
		System.out.println("I am in method c");
	}
	
	@Test
	public void b_method() {
		System.out.println("I am in method b");
	}
	
	@Test
	public void a_method(){
	System.out.println("I'm in method A");
	}
	
	@Test
	public void e_method(){
	System.out.println("I'm in method E");
	}
	
	@Test
	public void d_method(){
	System.out.println("I'm in method D");
	}

}
