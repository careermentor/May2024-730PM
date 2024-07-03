package org.xyz.automation.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{
	WebDriver driver;
	
	@Test
	public void checkallthecontrols() throws Exception
	{
		driver = new ChromeDriver();  //launch a edge browser
			
		String ExpURL = "https://www.facebook.com/";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		Assert.assertEquals(ActURL, ExpURL);
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActTitle, ExpTitle);
		
		//Assert.assertEquals(ActTitle, ExpTitle);
		System.out.println("This test case executed successfully");
		
		String ExpUname = "Email address or phone number";
		
		String ActUname = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUname);
		sa.assertEquals(ActUname, ExpUname);
		
		String ExpLoginLinktext = "Log in";
		
		String ActLoginLinktext = driver.findElement(By.name("login")).getText();
		System.out.println(ActLoginLinktext);
		
		sa.assertEquals(ActLoginLinktext, ExpLoginLinktext);
		
		System.out.println(driver.findElement(By.name("login")).getLocation());
		
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.name("login"));
		
		driver.close();
		
		sa.assertAll();
		
	}
	
	
}
