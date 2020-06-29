package com.quickmove.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;

public class LoginpageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginpageTest()
	{
		super();// it will call super class constructor
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		 loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginpagetitletest()
	{
		String title=loginpage.validateloginpagetitle();
		Assert.assertEquals(title, "QuickMove : Business Solution for Moving and Storage");
	
	}
	@Test(priority=2)
	public void CRMimageTest()
	{
		boolean flag=loginpage.validateimage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void LoginTest() 
	{
	homepage=	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
@AfterMethod
public void teardown()
{
	driver.quit();
}
}
