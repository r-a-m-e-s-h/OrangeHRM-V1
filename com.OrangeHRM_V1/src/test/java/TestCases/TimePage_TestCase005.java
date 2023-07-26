package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.TimePage;

public class TimePage_TestCase005 extends BaseClass {
	
	
	
	
	
	
	@Test
	public void TimePage_test() throws IOException
	{
		
		TimePage tp = new TimePage(driver);
		
		tp.clickTimepage();
		
		logger.info("Time Page btn is clicked");
		
		CaptureScreenShot(driver, "TimePage_TestCase");
		
	}

}
