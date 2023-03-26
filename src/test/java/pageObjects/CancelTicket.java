package pageObjects;

import org.openqa.selenium.WebDriver;

import driverUtilities.WebDriverUtilities;

public class CancelTicket
{
	WebDriver driver; // null
	WebDriverUtilities dUtils;
	public CancelTicket(WebDriver driver) //local variable
	{
		this.driver = driver; // a=a  1234
		dUtils = new WebDriverUtilities(driver); //1234
	}
	//***************WebElements*********************
	String cancelTktXpath = "//a[@title='Cancel Ticket']";
	String tktNumXpath = "//input[@name='id']";
	
	public void navigateToCancelTicket()
	{
		System.out.println("RC : Navigate to Cancel Ticket ");
		dUtils.clickElement(cancelTktXpath);
	}
	public void cancelBusTicket()
	{
		System.out.println("RC : Cancel Bus Ticket");
		dUtils.enterText(tktNumXpath, "123456");
	}

}
