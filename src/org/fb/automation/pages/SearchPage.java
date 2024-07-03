package org.fb.automation.pages;

import org.fb.automation.utilitiesPkg.ReadPropFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage 
{
	
	WebDriver driver;

	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void enter_searchtextbox(String item) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelement("home_search_textbox_id"))).sendKeys(item);
	}
	
	
	public void click_searchbttn() throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelement("home_search_bttn_id"))).click();
	}
	

}
