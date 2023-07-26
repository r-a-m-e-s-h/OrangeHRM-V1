package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {
	
	WebDriver driver;
	
	public MyInfoPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Info']")
	static WebElement myinfoBtn;
	
	
	public void ClickmyinfoBtn()
	{
		myinfoBtn.click();
	}
	
	
	

}
