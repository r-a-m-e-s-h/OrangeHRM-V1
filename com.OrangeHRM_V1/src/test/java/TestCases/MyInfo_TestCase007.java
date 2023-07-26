package TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.MyInfoPage;

public class MyInfo_TestCase007 extends BaseClass {
	
	
	@Test
	public void MyInfo_Test() throws IOException, InterruptedException, AWTException
	{
				
		MyInfoPage mi =  new MyInfoPage(driver);
		
		mi.ClickmyinfoBtn();
		
		logger.info("MyInfo Page Btn is clicked ");
		
		Thread.sleep(3000);
		
		KeyBoardRobotClass();
		
		
		
		mi.EnterFname();
		Thread.sleep(3000);
		
		
		
		mi.EnterLname();
		Thread.sleep(3000);
		
		mi.EnterNickName();
		Thread.sleep(3000);
		
		mi.SetEmpId();
		Thread.sleep(3000);
		
		
		mi.SetLicenseNo();
		Thread.sleep(3000);
		
		mi.SetLicenseExpireDate();
		Thread.sleep(3000);
		
		mi.SetSSNno();
		Thread.sleep(3000);
		
		mi.SetSINno();
		Thread.sleep(3000);
		
		//mi.SelectNationality();
		Thread.sleep(3000);
		
		CaptureScreenShot(driver, "MyInfo_TestCase");
		
	//	TearDown();
		
		
		
		
	}
	
	
	
	

}
