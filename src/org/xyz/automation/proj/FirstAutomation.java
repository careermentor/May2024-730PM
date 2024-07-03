package org.xyz.automation.proj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		driver = new ChromeDriver();  //launch a edge browser
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		/*
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		*/
		
					
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();  //will close one window
		//driver.quit();   //will close multiple window
		
	}
	

	@Test(enabled=true)
	public void login()
	{
		
		driver.findElement(By.id("email")).sendKeys("user1");
		
		driver.findElement(By.name("pass")).sendKeys("fhjkaskjsa");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@Test(enabled=false)
	public void signup() throws Exception
	{
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@placeholder='First name']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//*[@placeholder='First name']")).clear();
		
		driver.findElement(By.xpath("//*[@placeholder='First name']")).sendKeys("Appium");
		
	}
	
}
