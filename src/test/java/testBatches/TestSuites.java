package testBatches;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

//import org.junit.After;
//import org.junit.Test;

import generalUtilities.ReadPropertiesData;
import testScenarios.TestCases;

public class TestSuites extends TestCases
{
	String tType = new ReadPropertiesData("TestData/Config.properties").readData("TestingType");
	
	@Test
	public void runUserChoice()
	{
		if(tType.equalsIgnoreCase("SMOKE"))
		{
			smokeSuite();
		}
		else if(tType.equalsIgnoreCase("REGRESSION"))
		{
			regressionSuite();
		}
		else
		{
			smokeSuite();
		}
		
	}
	//@After
	@AfterTest
	public void cleanUp()
	{
		closeBrowser();
	}
	
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		bookBusTicketAndPrint();
		bookBusTicketAndCancel();
		bookBusTicketAndCheckStatus();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		bookBusTicketAndPrint();
		bookBusTicketAndCancel();
		bookBusTicketAndCheckStatus();
		bookBusTicketAndTrackService();
		bookBusTicketCheckStatusAndPrint();
		bookBusTicketTrackServiceAndPrint();
	}


}
