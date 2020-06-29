package com.online.flipkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resourc.BasicConfiguration;

public class TestSignUp extends BasicConfiguration {
	
	@Test
	
	public void testSign() throws IOException 
	{

		driver=initializeBrowser();
		driver.get(prop.getProperty("URL"));
		SignUpFlipkart sign=new SignUpFlipkart(driver);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		sign.getCreateaccount().click();
		sign.getMobileno().sendKeys("9448608362");
		sign.getContinuebtn().click();
		sign.getOTP().sendKeys("----");
		sign.getSetpassword().sendKeys("Ir@890de");
		sign.getSignupbtn().click();	         
		
	}

}
