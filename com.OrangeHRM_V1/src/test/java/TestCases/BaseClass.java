package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilites.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static Logger logger= Logger.getLogger(BaseClass.class);



	ReadConfig config = new ReadConfig();

	public String url = config.getApplicationURL();
	public String userName = config.getUserName();
	public String pwd = config.getPassword();
	public String browserName = config.getBrowserName();


	@BeforeSuite
	//@Parameters("browser")
	public void Setup() throws IOException
	{
		FileInputStream fis = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(fis);

		PropertyConfigurator.configure("log4j.properties");

		if(browserName.equalsIgnoreCase("chrome1"))
		{
			driver = new ChromeDriver();

			WebDriverManager.chromedriver().setup();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			logger.info("Url is entered");

		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{

			driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			logger.info("Url is entered");

		}
		else
		{
			driver = new ChromeDriver();

			WebDriverManager.chromedriver().setup();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get(url);
			logger.info("Url is entered");
		}

	}

	@AfterSuite
	public  void TearDown() 
	{
		driver.quit();
		logger.info("browser is closed");

	}
	public void CaptureScreenShot(WebDriver driver , String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(src, dest);

	}

	public void KeyBoardRobotClass() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
	}




}
