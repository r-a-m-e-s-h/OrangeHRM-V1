package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.RecuirementPage;

public class RecuirementPage_TestCase006 extends BaseClass {
	
	
	@Test
	public void Recuirement_Test() throws IOException
	{
		
		RecuirementPage rp = new RecuirementPage(driver);
		
		
		
		rp.clickRequirementPageBtn();
		
		logger.info("Recuirement Page btn is clicked");
		
		CaptureScreenShot(driver, "RecuirementPage_TestCase");
		
		//TearDown();
		
		
	}
	
	
	

}
