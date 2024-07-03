package org.fb.automation.testcases;

import org.fb.automation.basePkg.InitaiteBrowser;
import org.fb.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class TS01_LoginScenario extends InitaiteBrowser
{
	
	@Test
	public void tc01_validateloginfunctionaility() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass123");
		login.click_loginbttn();
		
		//"this.driver" is null
	}
	
	
}
