package org.fb.automation.utilitiesPkg;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	public static void takeresult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //capture screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./ScreenshotResults/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
