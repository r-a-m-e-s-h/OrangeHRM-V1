package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.MyInfoPage;

public class MyInfo_TestCase007 extends BaseClass {
	
	
	@Test
	public void MyInfo_Test() throws IOException
	{
		
		MyInfoPage mi =  new MyInfoPage(driver);
		
		mi.ClickmyinfoBtn();
		
		logger.info("MyInfo Page Btn is clicked ");
		
		CaptureScreenShot(driver, "MyInfo_TestCase");
		
		TearDown();
		
		
		
		
	}
	
	
	
	

}
