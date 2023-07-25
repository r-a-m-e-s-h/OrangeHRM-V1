package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage {
	
	WebDriver driver;
	
	public  Adminpage(WebDriver rdriver) 
	{
		driver = rdriver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//span[text()='Admin']")
	public static WebElement adminBtn; 
	
	public void clickadminBtn()
	{
		adminBtn.click();
	}
	
	

}
