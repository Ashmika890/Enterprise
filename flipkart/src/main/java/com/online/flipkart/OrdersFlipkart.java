package com.online.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrdersFlipkart {
	
	public WebDriver driver;
	By myaccount=By.xpath("//div[contains(text(),'My Account')]");
	By orders=By.linkText("home_orders");
	By search=By.xpath("//input[@placeholder='Search for products, brands and more']");
	By searchbtn=By.xpath("//button[@class='vh79eN']//*[local-name()='svg']");
	
	
	public OrdersFlipkart(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getOrders() {
		return driver.findElement(orders);
	}
	public WebElement getMyaccount() {
		return driver.findElement(myaccount);
	}
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	public WebElement getSearchbtn() {
		return driver.findElement(searchbtn);
	}
	
}
