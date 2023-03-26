package pageObjects;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import driverUtilities.WebDriverUtilities;
import generalUtilities.ReadPropertiesData;


public class Home
{
	WebDriver driver; // null
	WebDriverUtilities dUtils;
	ReadPropertiesData testData;
	public Home(WebDriver driver) //local variable
	{
		this.driver = driver; // a=a  1234
		dUtils = new WebDriverUtilities(driver); //1234
		String env = new ReadPropertiesData("TestData/Config.properties").readData("Environment");
		testData = new ReadPropertiesData("TestData/"+env+"Data.properties");
	}
	//***************WebElements*********************
	String sourceXpath = "//input[@name='source']";
	String destinationXpath = "//input[@name='destination']";
	String openCalendarXpath = "//input[@name='txtJourneyDate']";
	String jDateXpath = "//a[text()='20']";
	String searchBtnXpath = "//input[@title='Search']";
	String timeTableXpath = "//a[@title='TimeTable / Track']";
	String homeXpath = "//a[@title='Home']";
	String allServicesXpath = "//a[text()='All services Time Table & Tracking']";
	
	//*********************Reusable Components
	public void bookBusTicket() //throws IOException
	{
		//ReadPropertiesData.readData("URL");
		System.out.println(testData.readData("FromCity"));
		dUtils.enterText(sourceXpath,testData.readData("FromCity"));
		dUtils.clickEnter();
		dUtils.enterText(destinationXpath,testData.readData("ToCity"));
		dUtils.clickEnter();
		dUtils.clickElement(openCalendarXpath);
		//String d = readDate("JDate");
					//		"//a[text()='20']"
		//String jDateXpath = "//a[text()='"+d+"']"; 
		String jDateXpath = "//a[text()='"+testData.readData("JDate")+"']";
		dUtils.clickElement(jDateXpath);
		dUtils.clickElement(searchBtnXpath);
	}
	public void navigateToHome()
	{
		System.out.println("RC : Navigate to Home ");
		dUtils.clickElement(homeXpath);
	}	
	public void printTicket()
	{
		System.out.println("RC : Print Ticket");
	}

}
