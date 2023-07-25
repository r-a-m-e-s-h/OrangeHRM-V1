package Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
	
	Properties properties = new Properties();
	
	
	public  ReadConfig()
	{
		File src = new File("./config.properties");
		
		
		try {
			
			
			FileInputStream fis = new FileInputStream(src);
			properties.load(fis);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The Error is : " +e.getMessage());
		}
		
	}
	
	public String getApplicationURL()
	{
		String url = properties.getProperty("BaseURL");
		return url;
		
	}
	
	public String getUserName()
	{
		String uname = properties.getProperty("UserName");
		return uname;
	}
	
	public String getPassword()
	{
		String pwd = properties.getProperty("Password");
		return pwd;
	}
	
	
	
	
	

}
