package org.fb.automation.testdatagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGanareatorClass 
{

	@DataProvider(name="staticdata")
	public Object[][] testdata()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};  //1-D array
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass4"}};  //2-D array
		return data3;
	}
	

	@DataProvider(name="staticdata1")
	public Object[][] testdata1()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};  //1-D array
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass4"}};  //2-D array
		return data3;
	}
	
}
