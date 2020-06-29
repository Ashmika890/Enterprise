package com.quickmove.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class AddRoomSettingpage extends TestBase{
	
	@FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder1_divCategoryClose']")
	WebElement clickoncategordetailsicon;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_lstItem")
	WebElement itemcount;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_imgbtnAddCategoryDetail']")
	WebElement clickonaddroombutton;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlGoodsType")
	WebElement clickongoodstype;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtRoomTypeName']")
	WebElement Enterroomname;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_lstItem']//option[1]")
	WebElement firstelement;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_btnAddItemToRoom']")
	WebElement Clicknext;
	
	@FindBy(xpath="//span[contains(text(),'Category Type')]")
	WebElement Clickoutside;
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_imgbtnCategorysave']")
	WebElement Clickonsavebutton;
	
	
	public AddRoomSettingpage clickoncategryicon() 
	{   
		clickoncategordetailsicon.click();
		return new AddRoomSettingpage();
	}
	
	public AddRoomSettingpage clickonsavebutton() 
	{
		Clickonsavebutton.click();
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonenteroom() 
	{
		Enterroomname.click();
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonnext() throws InterruptedException 
	{
		Clicknext.click();
		
		return new AddRoomSettingpage();
	}

	public AddRoomSettingpage clickoutside() throws InterruptedException 
	{
		
		Thread.sleep(3000);
		Clickoutside.click();
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonaddRoombutton() 
	{
		clickonaddroombutton.click();
		return new AddRoomSettingpage();
	}
	
	/*public boolean retryingFindClick(By clickongoodstype) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            driver.findElement(clickongoodstype).click();
	            result = true;
	            break;
	        } catch(StaleElementReferenceException e) {
	        }
	        attempts++;
	    }
	    Select select=new Select(driver.findElement(clickongoodstype));
		//select.selectByVisibleText("Household goods");
	    select.selectByIndex(1);
		//select.selectByValue("Household goods");
	    return result;
	}*/
	public void selectelement() throws InterruptedException {
		
		/*WebElement Elelment=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lstItem"));
		
		List<WebElement> element=(List<WebElement>) driver.findElement(By.id("ctl00_ContentPlaceHolder1_lstItem"));*/
	//int count=	element.size();
		for(int attempts=0;attempts<=100;attempts++)	
		{
			
			clickonfirstelement();
			
			
				Thread.sleep(1000);
			
			
				clickoutside();
			
			clickonenteroom();
			//Thread.sleep(1000);
		
				clickonnext();
			
				Thread.sleep(4000);
			
	//	
		}
		clickonsavebutton();
	
}
	
	public void retryiclickelement(By firstelement)
	{
	 for(int attempt=0;attempt<=200;attempt++)
	 {
		 driver.findElement(firstelement).click();
	 }
	}
	public AddRoomSettingpage clickongoodstype() throws InterruptedException 
	{
		clickongoodstype.click();
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGoodsType")));
		//select.selectByVisibleText("Household goods");
		//select.selectByValue("Household goods");
		 select.selectByIndex(1);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage SelectOfficegoods() throws InterruptedException 
	{
		clickongoodstype.click();
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGoodsType")));
		//select.selectByVisibleText("Household goods");
		//select.selectByValue("Household goods");
		 select.selectByIndex(2);
		return new AddRoomSettingpage();
	}
	
	
	public AddRoomSettingpage SelectCommercialgoods() throws InterruptedException 
	{
		clickongoodstype.click();
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGoodsType")));
		//select.selectByVisibleText("Household goods");
		//select.selectByValue("Household goods");
		 select.selectByIndex(3);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage SelectIndustrialgoods() throws InterruptedException 
	{
		clickongoodstype.click();
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGoodsType")));
		//select.selectByVisibleText("Household goods");
		//select.selectByValue("Household goods");
		 select.selectByIndex(4);
		return new AddRoomSettingpage();
	}
	
	public AddRoomSettingpage SelectFIneartsgoods() throws InterruptedException 
	{
		clickongoodstype.click();
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGoodsType")));
		//select.selectByVisibleText("Household goods");
		//select.selectByValue("Household goods");
		 select.selectByIndex(5);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage SelectDataCentre() throws InterruptedException 
	{
		clickongoodstype.click();
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGoodsType")));
		//select.selectByVisibleText("Household goods");
		//select.selectByValue("Household goods");
		 select.selectByIndex(8);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage SelectITGoods() throws InterruptedException 
	{
		clickongoodstype.click();
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGoodsType")));
		//select.selectByVisibleText("Household goods");
		//select.selectByValue("Household goods");
		 select.selectByIndex(9);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage SelectPeronalEffects() throws InterruptedException 
	{
		clickongoodstype.click();
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGoodsType")));
		//select.selectByVisibleText("Household goods");
		//select.selectByValue("Household goods");
		 select.selectByIndex(10);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage SelectPershiableGoods() throws InterruptedException 
	{
		clickongoodstype.click();
		Thread.sleep(3000);
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGoodsType")));
		//select.selectByVisibleText("Household goods");
		//select.selectByValue("Household goods");
		 select.selectByIndex(11);
		return new AddRoomSettingpage();
	}
	
	
	public AddRoomSettingpage EnterRoomname(String roomname) 
	{Enterroomname.click();
		Enterroomname.sendKeys(roomname);
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage clickonfirstelement() 
	{
		firstelement.click();
		return new AddRoomSettingpage();
	}
	public AddRoomSettingpage()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	
}
