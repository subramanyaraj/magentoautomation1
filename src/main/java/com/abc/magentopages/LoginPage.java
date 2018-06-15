
package com.abc.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {	
	WebDriver driver=null;
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void sendUsername(String un)
	{
		driver.findElement(email).sendKeys(un);
	
	}
	public void sendPassword(String pass)
	{
		driver.findElement(pwd).sendKeys(pass);
	
	}
	public void clickLogin()
	{
		driver.findElement(login).click();
	
	}
	

}
