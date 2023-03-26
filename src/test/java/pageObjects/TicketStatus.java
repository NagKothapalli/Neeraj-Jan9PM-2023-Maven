package pageObjects;

import org.openqa.selenium.WebDriver;

import driverUtilities.WebDriverUtilities;

public class TicketStatus
{
	WebDriver driver; // null
	WebDriverUtilities dUtils;
	public TicketStatus(WebDriver driver) //local variable
	{
		this.driver = driver; // a=a  1234
		dUtils = new WebDriverUtilities(driver); //1234
	}
	//***************WebElements*********************
	String tktStatusXpath = "//a[@title='Ticket Status']";
	String mobileNumXpath = "//input[@name='mobileNo']";
	public void navigateToTicketStatus()
	{
		System.out.println("RC : Navigate to Ticket Status ");
		dUtils.clickElement(tktStatusXpath);
	}
	public void checkTicketStatus()
	{
		System.out.println("RC : Check Ticket Status");
		dUtils.enterText(mobileNumXpath, "9959775757");
	}

}
