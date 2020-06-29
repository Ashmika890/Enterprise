package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.EnquiryMasterpage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SurveyPage;
import com.quickmove.qa.util.TestUtil;

public class VarifySurveyPageTest extends TestBase{
	
	HomePage homepage;
	LoginPage loginpage;
	 EnquiryMasterpage enquirymaster;
	 String sheetname="Enquiry_Individual";
	 SurveyPage surveypage;
	
	 public VarifySurveyPageTest()
	 {
	 	super();
	 }
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 homepage.clickonsalesmodule();
		  enquirymaster=new EnquiryMasterpage();
}
	@Test
	public void varifysurvey() 
	{
		homepage.clickonhomepgesidemenu();
		homepage.ClickOnsurveylink();
		enquirymaster.copyenqid(); 
		//surveypage.surveysearchicon(Enqidcopy);
	}
	
	

}
