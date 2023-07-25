package TestCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class Login_TestCase001 extends BaseClass {

	
	@Test
	public void loginTC() 
	{
		
		LoginPage lp = new LoginPage(driver);
		
		lp.SetUserName(userName);
		logger.info("user name is entered");
		
		lp.SetPwd(pwd);
		logger.info("password is entered");
				
		lp.clickLoginBtn();
		logger.info("login button is clicked");
		
		lp.clickProfileBtn();
		logger.info("profile brn is clicked");
		
		lp.clickLogoutBtn();
		logger.info("Logout btn is clicked");
		
				
		
	}
	
	
	
	
	
}
