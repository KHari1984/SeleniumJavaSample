package com.krishna.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class signOnPage {
	public static WebElement element;
	
	public static WebElement enterUsername (String name) {
		element= LandingPage_Home.driver.findElement(By.name("userName"));
		element.sendKeys(name);
		return element;
	}
	
	public static WebElement enterpassword (String name) {
		element= LandingPage_Home.driver.findElement(By.name("password"));
		element.sendKeys(name);
		return element;
	}
   
	public static WebElement Login() {
		element= LandingPage_Home.driver.findElement(By.name("login"));
		element.click();
		return element;
	}
}
   

