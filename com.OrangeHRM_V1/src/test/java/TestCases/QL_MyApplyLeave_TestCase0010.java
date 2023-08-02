package TestCases;

import org.testng.annotations.Test;

import pageObjects.QL_ApplyLeavePage;

public class QL_MyApplyLeave_TestCase0010 extends BaseClass {
	
		
	@Test
	public void MapplyLeave_Test()
	{
		
		QL_ApplyLeavePage mlp1 =  new QL_ApplyLeavePage(driver);
		
		mlp1.clickApplyLeave();
		
		mlp1.checkTextDisplayed();
		
		
		
		
	}

}
