package com.quickmove.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.quickmove.qa.base.TestBase;

public class SurveyPage extends TestBase {

	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtSurveySearch']")
	WebElement surveysearchicon;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ibtnRefresh']")
	WebElement clickonsurveysearchicon;
	
	
	public SurveyPage surveysearchicon(String enqid)
	{
		surveysearchicon.sendKeys(enqid);//if we are clicking  on link then it should return landing page object
		return new SurveyPage();
	}
	public SurveyPage clickonsurveysearchicon()
	{
		clickonsurveysearchicon.click();//if we are clicking  on link then it should return landing page object
		return new SurveyPage();
	}
	
}
