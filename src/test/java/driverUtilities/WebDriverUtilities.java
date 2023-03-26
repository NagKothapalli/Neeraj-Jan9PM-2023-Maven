package driverUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities
{
	WebDriver driver; // null
	Actions actions;
	public WebDriverUtilities(WebDriver driver) //local variable
	{
		this.driver = driver; // a=a
		actions = new Actions(driver);
	}
	//--------------generic / utility functions-------------------
		public void clickElement(String myxpath)
		{
			//actions.pause(Duration.ofSeconds(4)).build().perform();//fixed wait
			//Explicit - we can wait for specific object/webelement dynamically
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(myxpath))));
			actions.moveToElement(element).click().build().perform();
			//driver.findElement(By.xpath(myxpath)).click();
		}
		
		public void enterText(String myxpath,String text)
		{
			//actions.pause(Duration.ofSeconds(4)).build().perform(); //fixed wait
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(myxpath))));
			driver.findElement(By.xpath(myxpath)).sendKeys(text);;
			//actions.moveToElement(element).sendKeys(text).build().perform();
		}
		
		public void clickEnter()
		{
			actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		}
		public void clickTab()
		{
			actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB).build().perform();
		}

}
