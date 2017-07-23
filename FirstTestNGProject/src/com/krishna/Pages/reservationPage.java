package com.krishna.Pages;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class reservationPage {
	public static WebElement element;
    
	public static void enterFromPort(String name) {
	    new Select(LandingPage_Home.driver.findElement(By.name("fromPort"))).selectByVisibleText(name);
	}
	
	public static void enterToPort(String name) {
	    new Select(LandingPage_Home.driver.findElement(By.name("toPort"))).selectByVisibleText(name);
	}
	
	
	public static void Search() {
   
	    LandingPage_Home.driver.findElement(By.name("findFlights")).click();
	    LandingPage_Home.driver.findElement(By.name("reserveFlights")).click();
	}
	public static WebElement enterFirstName(String name) {
	    element=LandingPage_Home.driver.findElement(By.name("passFirst0"));
	    element.sendKeys(name);
	    return element;
	}
	
	public static WebElement enterLastName(String name) {
	    element=LandingPage_Home.driver.findElement(By.name("passLast0"));
	    element.sendKeys(name);
		return element;
	}
	
	public static WebElement enterCreditcardNo(String name) {
	    element=LandingPage_Home.driver.findElement(By.name("creditnumber"));
	    element.sendKeys(name);
		return element;
	}
	
	
	public static void YrMo(String mo, String yr) {
		new Select(LandingPage_Home.driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText(mo);
	    new Select(LandingPage_Home.driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText(yr);	
	    }
	    
	public static WebElement enterccFirstName(String name) {
	    element=LandingPage_Home.driver.findElement(By.name("cc_frst_name"));
	    element.sendKeys(name);
	    return element;
	}
	
	public static WebElement enterccLastName(String name) {
	    element=LandingPage_Home.driver.findElement(By.name("cc_last_name"));
	    element.sendKeys(name);
		return element;
	}  
	public static void Buy() {
	    LandingPage_Home.driver.findElement(By.name("ticketLess")).click();
	    LandingPage_Home.driver.findElement(By.name("buyFlights")).click();
	   
        }
}