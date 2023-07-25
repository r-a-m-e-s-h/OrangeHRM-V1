package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	
	WebDriver driver;
	
	public LeavePage(WebDriver rdriver)
	{
		
		driver = rdriver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//span[text()='Leave']")
	static WebElement Leavebtn;
	
	public void clickLeavebtn()
	{
		Leavebtn.click();
	}
	
	
	

}
