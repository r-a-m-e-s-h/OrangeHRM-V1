package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QL_MyTimeSheetPage {
	
	
	
	WebDriver driver;
	
	public QL_MyTimeSheetPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		
		driver = rdriver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//button[@title='My Timesheet']")
	static WebElement timesheetbtn ;
	
	public void clickTimeSheetBtn()
	{
		timesheetbtn.click();
	}
	
	

}
