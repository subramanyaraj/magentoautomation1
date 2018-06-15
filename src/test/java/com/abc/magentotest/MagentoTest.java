package com.abc.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.abc.magentopages.HomePage;
import com.abc.magentopages.LoginPage;
import com.abc.magentopages.MainPage;


public class MagentoTest {
	@Test
	public  void magentoTest() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		System.out.println(driver);
		//home page
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount();		
		//login page		
		LoginPage lp=new LoginPage(driver);
				lp.sendUsername("subramanyaraj87@gmail.com");
				lp.sendPassword("Welcome123");
				lp.clickLogin();		
		//main page 
		MainPage mp=new MainPage(driver);
		mp.logOut();
	}

}
