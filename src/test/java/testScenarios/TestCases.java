package testScenarios;

import java.time.Duration;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driverUtilities.DriverSetUp;
import generalUtilities.ReadPropertiesData;
import pageObjects.CancelTicket;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.TicketStatus;
import pageObjects.TrackService;

public class TestCases //extends Login//,Home
{
	WebDriver driver;//null	
	Login login ;
	Home home ;
	CancelTicket cancelTicket;
	TrackService trackService ;
	TicketStatus ticketStatus;
	public TestCases() //default constructor
	{
		driver = new DriverSetUp().getDriver();//chrome / firefox / edge
		System.out.println("Execution Environment :" + new ReadPropertiesData("TestData/Config.properties").readData("Environment"));
		login = new Login(driver); //1234
		home = new Home(driver); //1234
		cancelTicket = new CancelTicket(driver);
		trackService = new TrackService(driver);
		ticketStatus = new TicketStatus(driver);
	}
	
	@Test
	public void bookBusTicketAndPrint() //Ravi - In Jira i have a user story assigned to me 
	{
		System.out.println("TestCase : BookBusTicketAndPrint ");
		//launch , login , bookBusTicket , Print , logout , close
		//login - 1.1 - enter username 1.2 - enter pw 1.3 - click submit
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookBusTicket();
		home.printTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketAndCancel() //Neeraj
	{
		System.out.println("TestCase : BookBusTicketAndCancel ");
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookBusTicket();
		cancelTicket.navigateToCancelTicket();
		cancelTicket.cancelBusTicket();
		login.logoutFromApplication();
		login.closeApplication();
		
	}
	@Test
	public void bookBusTicketAndCheckStatus() //Nag
	{
		System.out.println("TestCase : BookBusTicketAndCheckStatus ");
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookBusTicket();
		home.printTicket();
		ticketStatus.navigateToTicketStatus();
		ticketStatus.checkTicketStatus();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketAndTrackService() //John
	{
		System.out.println("TestCase : BookBusTicketAndTrackService ");
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookBusTicket();
		trackService.navigateToTrackService();
		trackService.trackTheServiceNumber();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketCheckStatusAndPrint() // Rani
	{
		System.out.println("TestCase : BookBusTicketCheckStatusAndPrint ");
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookBusTicket();
		home.printTicket();
		ticketStatus.navigateToTicketStatus();
		ticketStatus.checkTicketStatus();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketTrackServiceAndPrint() //Raj
	{
		System.out.println("TestCase : BookBusTicketTrackServiceAndPrint ");
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookBusTicket();
		home.printTicket();
		trackService.navigateToTrackService();
		trackService.trackTheServiceNumber();
		login.logoutFromApplication();
		login.closeApplication();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
