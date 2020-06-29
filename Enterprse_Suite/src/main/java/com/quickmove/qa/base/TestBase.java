package com.quickmove.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.quickmove.qa.util.TestUtil;

public class TestBase {
 public	static WebDriver driver;
 public	static Properties prop;
	public TestBase()
	{
		try {
			prop =new Properties();
		
		FileInputStream  fis= new FileInputStream("C:\\Users\\personal\\eclipse-workspace\\Enterprisesuite.zip_expanded\\Enterprse_Suite\\src\\main\\java\\com\\quickmove\\configuration\\config.properties");
			prop.load(fis);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		};
	}

	public static void initialization()
	{
		String Browsername=prop.getProperty("Browser");
		if(Browsername.equalsIgnoreCase("chrome"))
	
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\ChromeDriver.exe");
				 driver = new ChromeDriver();
			}
			else if(Browsername.equalsIgnoreCase("firefox"))
			{ 
				System.setProperty("webdriver.gecko.driver","C://Users//personal//Downloads//GeckoDriver.exe");
				driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
