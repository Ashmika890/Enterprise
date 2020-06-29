package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class EnquiryMasterpage extends TestBase {
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ViewEnquiry_imgbtnCreateEnquiry']")
	WebElement ClickOnaddenquiry;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlSurveyorsAssignee']")
	WebElement selectsurveyor;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtCustomerName']")
	WebElement EnterindividualFirstname;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtCustomerMobile']")
	WebElement Enterindividualmobile;
	
	@FindBy(xpath="//textarea[@id='ctl00_ContentPlaceHolder1_txtOriginAddress']")
	WebElement Enteroriginaddress;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtOriginCountry']")
	WebElement Selectorigincountry;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtOriginCity']")
	WebElement Enterorigincity;
	
	@FindBy(xpath="//textarea[@id='ctl00_ContentPlaceHolder1_txtDestinationAddress']")
	WebElement Destinationddress;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtDestinationCountry']")
	WebElement SelectDestinationcountry;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtDestinationCity']")
	WebElement EnterDestinationcity;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlEnquiryStatus']")
	WebElement Selectenqstatus;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ImgbtnSave']")
	WebElement Clickonsavebutton;
	
	public EnquiryMasterpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Clickonmobile() throws InterruptedException{
		
		Enterindividualmobile.click();
		Thread.sleep(1000);
		}
public void Clickonenquirysavebutton(){
		
	Clickonsavebutton.click();
	}
public void  selectsurveyor()

{
	selectsurveyor.click();
	Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlSurveyorsAssignee']")));
	//select.selectByVisibleText("Vinod");
	select.selectByIndex(2);
	
}
public String copyenqid() {
	String Enqidcopy=driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ViewEnquiry_divgvBorder']//td[3]")).getText();
System.out.println(Enqidcopy);
return Enqidcopy;
	}
	public void Selectenqstatus()
	{
		Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlEnquiryStatus']")));
		select.selectByIndex(2);//completed status
	}
	
	public void Enterindividualmobile(String enterindividualmobile)
	{
			
		Enterindividualmobile.sendKeys(enterindividualmobile);
	}
	
public void Destinationddress(String destinationaddress)
{
		
		Enteroriginaddress.sendKeys(destinationaddress);
}
	
public void EnterDestinationcity(String Destinationcity){
		
	EnterDestinationcity.sendKeys(Destinationcity);
		}
	
	public void SelectDestinationcountry(String origincountry) throws InterruptedException{
		
		SelectDestinationcountry.sendKeys(origincountry);
		Thread.sleep(3000);
		SelectDestinationcountry.sendKeys(Keys.ARROW_DOWN);
		SelectDestinationcountry.sendKeys(Keys.ENTER);
		/*Select select=new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDestinationCountry']")));
		select.selectByIndex(0);*/
		}
	
	
	
	public void EntryOriginaddress(String originaddress){
		
		Enteroriginaddress.sendKeys(originaddress);
		}
	
public void Enterorigincity(String origincity){
		
	Enterorigincity.sendKeys(origincity);
		}
	
	public void Selectorigincountry(String origincountry) throws InterruptedException{
		
		Selectorigincountry.sendKeys(origincountry);
		Thread.sleep(3000);
		Selectorigincountry.sendKeys(Keys.ARROW_DOWN);
		Selectorigincountry.sendKeys(Keys.ENTER);
		/*Select select=new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOriginCountry']")));
		select.selectByIndex(0);*/
		}
	
	public void Clickonenquiryaddbutton(){
		
		ClickOnaddenquiry.click();
	}

	public void EnterEnquiryaddbutton(String indivdualFirstname){
		
		EnterindividualFirstname.sendKeys(indivdualFirstname);
	}


}
