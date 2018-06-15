package com.abc.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver=null;
	//adding locators to instance varibles
	By myAccount=By.linkText("MY ACCOUNT");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}	
	public void clickOnMyAccount()
	{
		//use the same driver created in Magentotest.java class
		//home page
		driver.findElement(myAccount).click();
	
		//printing driver so to tell tat the driver ur referring is from magentotest.java
		System.out.println(driver);	
	}

}
