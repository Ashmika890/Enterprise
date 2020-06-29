package com.online.flipkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resourc.BasicConfiguration;

public class TestFlipkart extends BasicConfiguration{

	@Test
	public void testFlipkart() throws IOException, InterruptedException {
		

		driver=initializeBrowser();
		driver.get(prop.getProperty("URL"));
		LoginFlipkart login=new LoginFlipkart(driver);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		login.getEmail().sendKeys("9448608362");
		login.getPassword().sendKeys("Ir@80de");
		login.getLoginclick().click();
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		OrdersFlipkart orders=new OrdersFlipkart(driver);
	/*	Actions actions = new Actions(driver);
		WebElement Menu = orders.getMyaccount();
		actions.moveToElement(Menu);
		Thread.sleep(2000);
		Action action = actions.moveToElement(orders.getOrders()).build();
		action.perform();
		orders.getOrders().click();*/
		orders.getSearch().sendKeys("Mobile");
		orders.getSearchbtn().click();
			
	}
}
