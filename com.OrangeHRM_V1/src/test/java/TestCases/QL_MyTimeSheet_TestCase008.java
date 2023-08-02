package TestCases;

import org.testng.annotations.Test;

import pageObjects.QL_MyTimeSheetPage;

public class QL_MyTimeSheet_TestCase008 extends BaseClass {
	
	
	@Test
	public void myTimeSheet_Test()
	{
	
	
	QL_MyTimeSheetPage ts = new QL_MyTimeSheetPage(driver) ;
	
	ts.clickTimeSheetBtn();
	logger.info("TimeSheet btn clicked");
	
	}
}
