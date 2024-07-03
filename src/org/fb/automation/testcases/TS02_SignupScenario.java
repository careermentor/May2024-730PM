package org.fb.automation.testcases;

import org.fb.automation.basePkg.InitaiteBrowser;
import org.fb.automation.pages.SignupPage;
import org.testng.annotations.Test;

public class TS02_SignupScenario extends InitaiteBrowser
{
	
	@Test
	public void tc11_validatesignupfunctionaility() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewacountbttn();
		sign.enter_firstname("Selenium");
		sign.enter_dob_day("5");
		
		sign.click_male();
		
	}
	
	
}
