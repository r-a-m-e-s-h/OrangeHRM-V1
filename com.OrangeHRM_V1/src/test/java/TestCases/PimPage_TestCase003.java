package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.PimPage;

public class PimPage_TestCase003 extends BaseClass {
	
	
	@Test
	public void PimTestCase() throws IOException
	{
		
		PimPage pp = new PimPage(driver);
		
		pp.clickPimbtn();
		logger.info("PIM button is clicked");
		
		CaptureScreenShot(driver, "PimPage");	
		
		
		
		
	}

}
