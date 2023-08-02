package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QL_MyLeavePage {
	
	WebDriver driver;
	
	
	public QL_MyLeavePage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
	
		driver = rdriver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[5]/button")
	static WebElement QL_leaveBtn;
	
	@FindBy(xpath="//label[text()='From Date']/following::div//input[1]") 
	static WebElement frmDate ;
	
	@FindBy(xpath="//label[text()='To Date']/following::div//input[1]")
	static WebElement toDate;
	
	@FindBy(xpath="//*[text()='Show Leave with Status']/following::div[4]")
	static WebElement leaveStatus;
	
	@FindBy(xpath="//*[text()='Leave Type']/following::div[4]")
	static WebElement leaveType;
	
	@FindBy(xpath="//button[text()=' Search ']")
	static WebElement searchbtn;
	
	public void clickQL_Leavepage()
	{
		QL_leaveBtn.click();
	}
	
	public void SetFromDate() throws InterruptedException
	{
		
		frmDate.sendKeys(Keys.CONTROL +"a", Keys.BACK_SPACE);
		Thread.sleep(2000);
		
		frmDate.sendKeys("2023-05-21");
	}
	public void SetToDate() throws InterruptedException
	{
		toDate.sendKeys(Keys.CONTROL +"a", Keys.BACK_SPACE);
		Thread.sleep(2000);
		
		toDate.sendKeys("2023-05-25");
	}
	public void SetLeaveStatus()
	{
		Select s = new Select(leaveStatus);
		s.selectByVisibleText("Taken");
	}
	public void SetLeaveType()
	{
		Select s1 = new Select(leaveType);
		s1.selectByVisibleText("US - Personal");
		
	}
	public void clickSearchBtn()
	{
		searchbtn.click();
	}
	
	
	
	
	
	

}
