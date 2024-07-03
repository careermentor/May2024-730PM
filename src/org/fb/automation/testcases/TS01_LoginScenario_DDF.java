package org.fb.automation.testcases;

import org.fb.automation.basePkg.InitaiteBrowser;
import org.fb.automation.pages.LoginPage;
import org.fb.automation.testdatagenerator.TestDataGanareatorClass;
import org.testng.annotations.Test;

public class TS01_LoginScenario_DDF extends InitaiteBrowser
{
	
	@Test(dataProvider="staticdata",dataProviderClass=TestDataGanareatorClass.class)
	public void tc01_validateloginfunctionaility(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
		
	}
	
		
}
