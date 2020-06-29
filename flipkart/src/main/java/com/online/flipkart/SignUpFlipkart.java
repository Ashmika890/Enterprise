package com.online.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpFlipkart {

	public WebDriver driver;
	public SignUpFlipkart(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By login=By.xpath("//a[@class='_3Ep39l']");
	By createaccount=By.xpath("//a[@href=\'/account/login?signup=true\']");
	By mobileno=By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	By continuebtn=By.xpath("//span[contains(text(),'CONTINUE')]");
	By OTP=By.xpath("//div[3]//input[1]");
	By setpassword=By.xpath("//div[4]//input[1]");
	By signupbtn=By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Signup')]");
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	public WebElement getCreateaccount() {
		return driver.findElement(createaccount);
	}
	public WebElement getMobileno() {
		return driver.findElement(mobileno);
	}
	public WebElement getContinuebtn() {
		return driver.findElement(continuebtn);
	}
	public WebElement getOTP() {
		return driver.findElement(OTP);
	}
	public WebElement getSetpassword() {
		return driver.findElement(setpassword);
	}
	public WebElement getSignupbtn() {
		return driver.findElement(signupbtn);
	}
	
}
