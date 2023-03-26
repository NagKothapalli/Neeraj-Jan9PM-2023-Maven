package practiceTestNG;

import org.testng.annotations.Test;

public class TestNGTestsWithPriority
{
	@Test
	public void launchApplication()
	{
		System.out.println("Test Case : Launch  Application");
	}
	@Test(priority = 0, enabled = true)
	public void loginToApplication()
	{
		System.out.println("Test Case : Login To Application");
	}
	@Test(priority = 1, enabled = false)
	public void composeAndSendAnEmail()
	{
		System.out.println("Test Case : ComposeAndSendAnEmail ");		
	}	
	@Test(priority = 3)
	public void forwardAnEmail()
	{
		System.out.println("Test Case : ForwardAnEmail ");
	}
	@Test(priority = 4)
	public void deleteAnEmail()
	{
		System.out.println("Test Case : DeleteAnEmail ");
	}
	@Test(priority = 2)
	public void replyToAnEmail()
	{
		System.out.println("Test Case : ReplyToAnEmail ");
	}

}
