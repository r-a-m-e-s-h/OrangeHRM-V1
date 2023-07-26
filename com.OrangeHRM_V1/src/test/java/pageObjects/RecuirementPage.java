package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecuirementPage {
	
	
	WebDriver driver;
	
	public RecuirementPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Recruitment']")
	static WebElement RecuirementPageBtn;
	
	
	
	
	public void clickRequirementPageBtn()
	{
		RecuirementPageBtn.click();
	}
	
	

}
