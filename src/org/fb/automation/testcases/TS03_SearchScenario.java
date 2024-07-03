package org.fb.automation.testcases;

import org.fb.automation.basePkg.InitaiteBrowser;
import org.fb.automation.pages.SearchPage;
import org.testng.annotations.Test;

public class TS03_SearchScenario extends InitaiteBrowser
{
	
	@Test
	public void tc01_validatesearchfunctionaility() throws Exception
	{
		SearchPage sp = new SearchPage(driver);
		
		sp.enter_searchtextbox("iphone 15");
		sp.click_searchbttn();
		
	}
	
	
}
