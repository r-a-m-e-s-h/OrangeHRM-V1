package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class QL_ApplyLeavePage {
	
	
	WebDriver driver;
	
	public QL_ApplyLeavePage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		
		driver = rdriver;
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[5]/button")
	static WebElement ApplyLeaveBtn ;
	
	@FindBy(xpath="//p[text()='No Leave Types with Leave Balance']")
	static WebElement txt;
	
	
	public void clickApplyLeave()
	{
		ApplyLeaveBtn.click();
	}
	
	public void checkTextDisplayed()
	{
		String test_Text ="hello";
		Assert.assertEquals(txt, test_Text);
		
		System.out.println("Text displayed : "+txt);
	}
	
	

}
