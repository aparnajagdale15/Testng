package priority;

import org.testng.annotations.Test;

public class ComboPriorityNonPriority {
	
	@Test
	public void c_method() {
		System.out.println("I m in method c");
	}
	
	@Test
	public void b_method(){
	System.out.println("I'm in method B");
	}
	
	@Test(priority=6)
	public void a_method(){
	System.out.println("I'm in method A");
	}
	
	@Test(priority=0)
	public void e_method(){
	System.out.println("I'm in method E");
	}
	
	@Test(priority=6)
	public void d_method(){
		System.out.println("I'm in method D");
	}
	


}
