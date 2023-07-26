package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimePage {
	
	
	WebDriver driver;
	
	public TimePage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		
		driver = rdriver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Time']")
	static WebElement Timebtn;
	
	public void clickTimepage()
	{
		Timebtn.click();
	}
	
	
	

}
