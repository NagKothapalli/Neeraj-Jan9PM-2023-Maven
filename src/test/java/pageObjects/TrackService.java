package pageObjects;

import org.openqa.selenium.WebDriver;

import driverUtilities.WebDriverUtilities;

public class TrackService
{
	WebDriver driver; // null
	WebDriverUtilities dUtils;
	public TrackService(WebDriver driver) //local variable
	{
		this.driver = driver; // a=a  1234
		dUtils = new WebDriverUtilities(driver); //1234
	}
	//***************WebElements*********************
	String trackServiceXpath = "//a[@title='Track Service']";
	String serviceNumXpath = "//input[@name='serviceCode']";
	public void navigateToTrackService()
	{
		System.out.println("RC : Navigate to Track Service ");
		dUtils.clickElement(trackServiceXpath);
	}
	public void trackTheServiceNumber()
	{
		System.out.println("RC : Track The Service Number");
		dUtils.enterText(serviceNumXpath, "2244");
	}


}
