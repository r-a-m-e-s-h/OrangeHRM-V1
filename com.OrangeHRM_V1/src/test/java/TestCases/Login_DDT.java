package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class Login_DDT extends BaseClass {

	
	
	@DataProvider(name = "loginData" )
	public Object[][] getXLData() throws IOException
	{
		String fpath = System.getProperty("user.dir") + "/Excel-Data/TestData.xlsx" ; 
		
		FileInputStream fis = new FileInputStream(fpath);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		int colCount = sheet.getRow(0).getLastCellNum();
		
		
		Object[][] data = new Object[rowCount][colCount];
		
		
		
		for(int i=1;i<=rowCount;i++)
		{
			Row row = sheet.getRow(i);
			
			for(int j=0;j<colCount;j++)
			{
				Cell cell = row.getCell(j);
				
				data[i-1][j] = cell.getStringCellValue();
			}
			
		}
		
		return data;
		
	}
	
	
	@Test(dataProvider = "loginData")
	public void Login_Test(String name, String pwd) throws IOException, InterruptedException
	{
		
		LoginPage dataLP = new LoginPage(driver);
		
		dataLP.SetUserName(name);
		logger.info("Username from XLSheet Taken");
		
		dataLP.SetPwd(pwd);
		logger.info("Pwd from XLSheet Taken");
		
		dataLP.clickLoginBtn();
		logger.info("Login Btn is clicked");
		
		CaptureScreenShot(driver, "DataProvider TestCase");
		Thread.sleep(1000);
		
		//driver.navigate().refresh();
		
		dataLP.clickProfileBtn();
		logger.info("Profile Btn clicked ");
		
		
		Thread.sleep(2000);
		
		dataLP.clickLogoutBtn();
		logger.info("Logout btn is clicked");
		
		TearDown();
				
		
	}
	
}
