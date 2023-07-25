package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LeavePage;

public class LeavePage_TestCase004  extends BaseClass {
	
	
	@Test
	public void LeavePageTest() throws IOException
	{
		
		LeavePage l = new LeavePage(driver);
		
		l.clickLeavebtn();
		logger.info("Leave button is clicked");
		
		CaptureScreenShot(driver, "leavePage");	
		
		
	}

}
