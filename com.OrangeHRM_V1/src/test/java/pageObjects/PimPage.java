package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

	WebDriver driver;

	public PimPage(WebDriver rdriver)
	{
		driver = rdriver;

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//span[text()='PIM']")
	static WebElement PIMbtn;
	
	public void clickPimbtn()
	{
		PIMbtn.click();
	}
	
	


}
