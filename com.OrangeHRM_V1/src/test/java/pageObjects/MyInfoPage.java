package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class MyInfoPage  {
	
	WebDriver driver;
	
	public MyInfoPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Info']")
	static WebElement myinfoBtn;
	
	@FindBy(xpath="//div//a[text()='Personal Details']")
	static WebElement personalDetailsBtn;
	
	@FindBy(xpath="//div//input[@name='firstName']")
	static WebElement fname;
	
	@FindBy(xpath="//div//input[@name='lastName']")
	static WebElement lname;
	
	@FindBy(xpath="//div//label[text()='Nickname']//following::input[1]")
	static WebElement NickName;
	
	@FindBy(xpath="//div//label[text()='Employee Id']//following::input[1]")
	WebElement empID;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
	WebElement licenseNo;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
	WebElement licenseExpireDate;
	
	@FindBy(xpath="//div//label[text()='SSN Number']//following::input[1]")
	WebElement SSNno;
	
	@FindBy(xpath="//div//label[text()='SIN Number']//following::input[1]")
	WebElement SINno;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i") 
	WebElement nationality;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i")
	WebElement martialStatus;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
	static WebElement dob;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
	static WebElement gender;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
	static WebElement saveBtn;
	
	public void ClickmyinfoBtn()
	{
		myinfoBtn.click();
	}
	
	
	public void EnterFname() throws AWTException, InterruptedException
	{
		
		fname.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
		
		Thread.sleep(2000);
		
		fname.sendKeys("Tom");
	}
	public void EnterLname() throws InterruptedException
	{
		
		lname.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
		
//lname.sendKeys(Keys.CLEAR);
				
		Thread.sleep(2000);
		lname.sendKeys("Smasher");
	}
	public void EnterNickName()
	{
		NickName.sendKeys("Naruto");
	}
	
	public void SetEmpId() throws InterruptedException
	{
		empID.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
		Thread.sleep(2000);
		
		empID.sendKeys("8795");
	}
	public void SetLicenseNo()
	{
		licenseNo.sendKeys("1998");
	}
	public void SetLicenseExpireDate()
	{
		licenseExpireDate.sendKeys("2026-12-31");
	}
	
	public void SetSSNno()
	{
		SSNno.sendKeys("12345678");
	}
	public void SetSINno()
	{
		SINno.sendKeys("88775654212");
	}
	public void SelectNationality() throws InterruptedException
	{
//		nationality.sendKeys(Keys.CONTROL + "a" , Keys.BACK_SPACE);
//		Thread.sleep(2000);
//		nationality.sendKeys("India");
		
	}
	public void Setdob() throws InterruptedException
	{
		dob.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
		Thread.sleep(2000);
		
		dob.sendKeys("1998-08-15");
	}
	public void SetGender()
	{
		gender.click();
	}
	public void ClickSaveBtn()
	{
		saveBtn.click();
	}

}
