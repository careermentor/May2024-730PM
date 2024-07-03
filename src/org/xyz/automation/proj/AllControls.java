package org.xyz.automation.proj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AllControls 
{
	WebDriver driver;
	
	@Test
	public void checkallthecontrols() throws Exception
	{
		driver = new ChromeDriver();  //launch a edge browser
			
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement xyz = driver.findElement(By.name("fld_username"));
		
		//String x = "A";
		
		
		xyz.sendKeys("Selenium");
		driver.findElement(By.name("fld_username")).clear();
		
		driver.findElement(By.name("fld_username")).sendKeys("Java");
		
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		boolean actstatus = driver.findElement(By.name("terms")).isSelected();
		System.out.println(actstatus);
		
		Assert.assertEquals(actstatus, false);
		
		driver.findElement(By.name("terms")).click();
		
		boolean actstatus1 = driver.findElement(By.name("terms")).isSelected();
		System.out.println(actstatus1);
		
		Assert.assertEquals(actstatus1, true);
		
		
		//driver.findElement(By.xpath("/html/body/div[4]/section/ul/li[1]/div/form/div/input[1]")).click();
		
		//driver.findElement(By.className("displayPopup")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));	
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//con.selectByVisibleText("India");
		
		//con.deselectByVisibleText("India");
		//con.selectByVisibleText("United Kingdom");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//Thread.sleep(5000);  //fixed wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		st.selectByVisibleText("Arizona");
		
		
	}
	
	
}
