package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//input[@name='username']")
	 static WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	static WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	static WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
	static WebElement profileBtn;
	
	@FindBy(xpath="//ul//li//a[text()='Logout']")
	static WebElement logoutBtn;
	
	
	public void SetUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void SetPwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	public void clickProfileBtn()
	{
		profileBtn.click();
	}
	public void clickLogoutBtn()
	{
		logoutBtn.click();
	}
	
	
	
	
	
	
	

}
