package com.abc.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	WebDriver driver;
	By logout=By.linkText("Log Out");
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void logOut()
	{
		driver.findElement(logout).click();
		
	}
	

}
