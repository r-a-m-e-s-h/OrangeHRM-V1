package TestCases;

import org.testng.annotations.Test;

import pageObjects.QL_MyLeavePage;

public class QL_MyLeavePage_TestCase009 extends BaseClass {
	
	
	
	@Test
	public void LeavePage_test() throws InterruptedException
	{
		QL_MyLeavePage mlp = new QL_MyLeavePage(driver);
		
		mlp.clickQL_Leavepage();
		
		Thread.sleep(2000);
		
		mlp.SetFromDate();
		
		Thread.sleep(2000);
		
		mlp.SetToDate();
		
		Thread.sleep(2000);
		
		mlp.SetLeaveStatus();
		
		Thread.sleep(2000);
		
		
		mlp.SetLeaveType();
		
		Thread.sleep(2000);
		
		mlp.clickSearchBtn();
		Thread.sleep(2000);
		
		
	}
	
	

}
