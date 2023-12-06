package TestCases;


import static org.testng.Assert.assertEquals;

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dummyTest {



	@Test
	public void test11() throws InterruptedException
	{
		//Test-Scenario-2
		/*
		 * WebDriver driver;
		 * 
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * driver= new ChromeDriver();
		 * 
		 * driver.get("https://www.lambdatest.com/selenium-playground");
		 * 
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 * 
		 * driver.findElement(By.xpath("//*[text()='Drag & Drop Sliders']")).click();
		 * 
		 * WebElement slider =
		 * driver.findElement(By.xpath("//*[@id=\"slider3\"]/div/input"));
		 */

		/*
		 * WebElement to = driver.findElement(By.xpath("//*[@id=\"rangeSuccess\"]"));
		 * 
		 * Thread.sleep(2000);
		 */

		/*
		 * Actions moveSlider = new Actions(driver);
		 * 
		 * Action action = moveSlider.dragAndDropBy(slider,15,95).build().perform();
		 */

		//new Actions(driver).dragAndDropBy(slider,100,0).perform();

		//Test-Scenario-1
		/* 
		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver= new ChromeDriver();

		driver.get("https://www.lambdatest.com/selenium-playground");

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[1]/a")).click();

		driver.findElement(By.id("user-message")).sendKeys("Welcome to Lambda Test");

		driver.findElement(By.id("showInput")).click();

		if(driver.findElement(By.id("message")).isDisplayed())
		{
			System.out.println("Test is displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}

	*/
		//Test-Scenario-3
		
		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver= new ChromeDriver();

		driver.get("https://www.lambdatest.com/selenium-playground");
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[5]/a")).click();
		
		//submit-button
		driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();
		Thread.sleep(2000);

		//name-txtbox
		
		String msg = driver.findElement(By.xpath("//*[@id=\"name\"]")).getAttribute("validationMessage");   
		System.out.println(msg);
		
		String txt = "Please fill out this field."; 
		assertEquals(msg, txt);
		
		driver.get(driver.getCurrentUrl());
		
		 driver.findElement(By.name("name")).sendKeys("Tom");
		 Thread.sleep(2000);
		 driver.findElement(By.id("inputEmail4")).sendKeys("tom@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.name("password")).sendKeys("tom@1234");
		 Thread.sleep(1000);
		 driver.findElement(By.name("company")).sendKeys("Hollywood");
		 Thread.sleep(1000);
		//1
		 driver.findElement(By.name("website")).sendKeys("www.Hollywood.com");
		 Thread.sleep(1000);
		 
		 WebElement dd = driver.findElement(By.name("country"));
		 Select s1 = new Select(dd);
		 s1.selectByVisibleText("United States");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("city")).sendKeys("USA");
		 Thread.sleep(1000);
		 driver.findElement(By.name("address_line1")).sendKeys("USA-North street");
		 Thread.sleep(1000);
		 driver.findElement(By.name("address_line2")).sendKeys("USA-near Bus Stand");
		 Thread.sleep(1000);
		 driver.findElement(By.id("inputState")).sendKeys("Madurai");
		 Thread.sleep(1000);
		 driver.findElement(By.id("inputZip")).sendKeys("600001");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();
		 Thread.sleep(1000);
		 
		 WebElement text = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p"));
		 
		 String Success_txt = text.getText();
		 
		 String Expected_Success_Txt = "Thanks for contacting us, we will get back to you shortly.";
		 
		 assertEquals(Success_txt, Expected_Success_Txt);
		 
		 System.out.println("Succes message validated");
		 
		 
		 
		 
		 
	}

}
