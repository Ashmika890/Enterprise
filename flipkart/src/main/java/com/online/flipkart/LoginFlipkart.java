package com.online.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFlipkart {
	
	public WebDriver driver;
	public LoginFlipkart(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By login=By.xpath("//a[@class='_3Ep39l']");
	By email=By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	By password=By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']");	
	By loginclick=By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");

	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLoginclick() {
		return driver.findElement(loginclick);
	}
	
}
