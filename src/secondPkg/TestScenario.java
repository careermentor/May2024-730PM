package secondPkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario 
{

	@Test(groups="Smoke")
	public void first_testcase()
	{
		System.out.println("this is first test case");
		
		Assert.assertEquals("Hello", "Hello");  //hard assertion
		
	}
	
	@Test(groups="Sanity")
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test(groups="Regression")
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test(groups={"Regression","Sanity"})
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	
	
}
