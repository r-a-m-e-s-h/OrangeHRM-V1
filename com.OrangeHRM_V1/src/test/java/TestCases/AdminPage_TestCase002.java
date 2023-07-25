package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Adminpage;

public class AdminPage_TestCase002  extends BaseClass {
	
	
	@Test
	public void AdminpageTest() throws IOException
	{
		
		Adminpage ap = new Adminpage(driver);
		
		ap.clickadminBtn();
		logger.info("Admin Button is clicked");
		
		CaptureScreenShot(driver, "AdminPage");	
		
		
		
	}
	
	
	

}
