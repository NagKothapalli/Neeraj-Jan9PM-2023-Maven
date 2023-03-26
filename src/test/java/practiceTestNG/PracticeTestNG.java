package practiceTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class PracticeTestNG
{	
	public PracticeTestNG()
	{
		System.out.println("PracticeTestNG Default Constructor");
	}
	
	@BeforeTest  // one time for the entire class
	public void launchApplication()
	{
		System.out.println("Launch Application");
		System.out.println("Maximize");
	}
	
	@BeforeMethod  // Applicable for each method with @Test annotation
	public void loginApplication()
	{
		System.out.println("Login Application");
	}
	@AfterMethod
	public void logoutApplication()
	{
		System.out.println("Logout Application");
	}
	@AfterTest
	public void closeApplication()
	{
		System.out.println("close Application");
	}
	
	@Test
	public void bookFlight()  //Login with user A
	{
		//login
		System.out.println("Book Flight");
		//if(navigate.isDiplayed()) then log as success else log as fail
		
		Reporter.log("Navigate to Flight Successfull",true);
		Reporter.log("Search Flight Successfull");
		Reporter.log("Select Flight Successfull");
		Reporter.log("Book Flight Successfull");
		//Assert.assertEquals(true, false);
		//logout
	}
	@Test
	public void bookCar() //Login with user B
	{
		//login
		System.out.println("Book Car");
		Reporter.log("Book Car Successfull");
		Reporter.log("Book Car Successfull");
		Reporter.log("Book Car Successfull");
		Reporter.log("Book Car Successfull");
		//Assert.assertEquals(true, false);
		//logout
	}
	@Test
	public void bookHotel() //Login with user C
	{
		//login
		System.out.println("Book Hotel");
		Reporter.log("Book Hotel Successfull");
		Reporter.log("Book Hotel Successfull");
		Reporter.log("Book Hotel Successfull");
		Reporter.log("Book Hotel Successfull");
		//Assert.assertEquals(true, true);
		//logout
	}
	@Test
	public void bookCruise() //Login with user D
	{
		//login
		System.out.println("Book Cruise");
		Reporter.log("Book Cruise Successfull");
		Reporter.log("Book Cruise Successfull");
		Reporter.log("Book Cruise Successfull");
		Reporter.log("Book Cruise Successfull");
		//Assert.assertEquals(true, true);
		//logout
	}
	

}
