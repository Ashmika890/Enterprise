package com.quickmove.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;



public class HomePageTest extends TestBase{
	HomePage homepage;
	LoginPage loginpage;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		//homepage=new HomePage();
	}
	@Test(priority=2)
	public void verifyhomepagetitletest()
	{ homepage.clickonsalesmodule();
		String homepagetitle=homepage.verifyhomepagetitle();
		Assert.assertEquals(homepagetitle, "QuickMove - Enquiry ","home page title is not matching");
	}
	
	@Test(priority=1)
	public void verifysalelinktest()
	{
		homepage.clickonsalesmodule();
	}
	@Test(priority=3)
	public void verifyusernametest()
	{
	boolean	flag=homepage.verifyusername();
	Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
