package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class Login_TestCase001 extends BaseClass {

	
	@Test
	public void loginTC() throws IOException 
	{
		
		LoginPage lp = new LoginPage(driver);
		
		lp.SetUserName(userName);
		logger.info("user name is entered");
		
		lp.SetPwd(pwd);
		logger.info("password is entered");
				
		lp.clickLoginBtn();
		logger.info("login button is clicked");
		
		//lp.clickProfileBtn();
		//logger.info("profile brn is clicked");
		
//		lp.clickLogoutBtn();
//		logger.info("Logout btn is clicked");
		
		CaptureScreenShot(driver, "LoginPage");	
		
	}
	
	
	
	
	
}
