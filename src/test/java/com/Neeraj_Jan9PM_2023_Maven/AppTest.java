package com.Neeraj_Jan9PM_2023_Maven;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
	String expectedTitle = "Gmail";
	public AppTest() //default constructor
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//it will open an empty chrome browser  //1234
	}
	//Execution Flow : Class Variables -> Constructor -> Before -> Test	
	@Test
	public void launchApplication()
	{
		System.out.println("Launch Application");
		//open an empty browser  then call your app URL in that browser		
		driver.get("https://gmail.com"); //1234
		String actualtitle = driver.getTitle();
		System.out.println("title of the app :" + actualtitle);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL :" + url);
		String sessionID = driver.getWindowHandle();
		System.out.println("My Session ID :" + sessionID);
		//syso Ctrl+Space
		//Validation | Assertion
		if(expectedTitle.equals(actualtitle))
		{
			System.out.println("Title Validation is Successfull");
		}
		else
		{
			System.out.println("Title Validation is Failed");
		}

		Assert.assertEquals(expectedTitle, actualtitle);
		
	}
}
