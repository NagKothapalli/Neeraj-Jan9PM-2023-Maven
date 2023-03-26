package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import generalUtilities.ReadPropertiesData;

public class Login
{
	WebDriver driver; // null
	ReadPropertiesData testData;
	public Login(WebDriver driver) //local variable
	{
		this.driver = driver; // a=a  1234
		String env = new ReadPropertiesData("TestData/Config.properties").readData("Environment");
		
		testData = new ReadPropertiesData("TestData/"+env+"Data.properties");
	}
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		driver.get(testData.readData("URL"));
	}
	
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	

}
