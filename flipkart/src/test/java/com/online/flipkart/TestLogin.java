package com.online.flipkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resourc.BasicConfiguration;

public class TestLogin extends BasicConfiguration{

	
	@Test
	public void test() throws IOException {
		
		driver=initializeBrowser();
		driver.get(prop.getProperty("URL"));
		LoginFlipkart login=new LoginFlipkart(driver);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//login.getLogin().click();
		
		
		/*driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']")).click();
		String windowlogin=driver.getWindowHandle();
		driver.switchTo().window(windowlogin);*/
		
		login.getEmail().sendKeys("9448608362");
		login.getPassword().sendKeys("Ir@80de");
		login.getLoginclick().click();
		
		
	}
}
