package org.fb.automation.pages;

import org.fb.automation.utilitiesPkg.ReadPropFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage 
{
	
	WebDriver driver;

	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	
	public void click_createnewacountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("login_createnewaccount_bttn_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_firstname_name"))).sendKeys(fname);
	}
	
	public void enter_dob_day(String dy) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFile.readelement("signup_dob_day_name"))));
		
		dob_day.selectByVisibleText(dy);
		
	}

	public void click_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("signup_gender_male_xpath"))).click();
	}
	

}
