package org.fb.automation.pages;

import org.fb.automation.utilitiesPkg.ReadPropFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelement("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("login_password_name"))).sendKeys(pass);
	}

	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("login_loginbttn_name"))).click();
	}
	

}
