package driverUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generalUtilities.ReadPropertiesData;

public class DriverSetUp
{
	WebDriver driver;
	public WebDriver getDriver()
	{
		String browser = new ReadPropertiesData("TestData/Config.properties").readData("Browser");
		if(browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
			driver = new ChromeDriver();//it will open an empty chrome browser  //1234	
		}
		else if(browser.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\JarFiles\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();//it will open an empty chrome browser  //1234	
		}
		else if(browser.equalsIgnoreCase("EDGE")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\edgedriver_win64_111\\msedgedriver.exe");
			driver = new EdgeDriver();//it will open an empty chrome browser  //1234	
		}
		else {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
			driver = new ChromeDriver();//it will open an empty chrome browser  //1234	
		}
		return driver; // chrome / firefox / edge
	}

}
