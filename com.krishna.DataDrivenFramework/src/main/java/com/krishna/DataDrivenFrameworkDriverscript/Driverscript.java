package com.krishna.DataDrivenFrameworkDriverscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.krishna.ConstantValues.ConstantVariables;
import com.krishna.Pages.LandingPage_Home;
import com.krishna.Pages.reservationPage;
import com.krishna.Pages.signOnPage;


public class Driverscript {
	
	public static void main(String[] args) throws Exception {
		
//------------------Scenario 1, Login and book a return a return ticket-------
		
		LandingPage_Home.browserType(ConstantVariables.browserType);
		LandingPage_Home.openBrowser(ConstantVariables.url);
		
		signOnPage.enterUsername(ConstantVariables.Username);
		signOnPage.enterpassword(ConstantVariables.password);
		signOnPage.Login();
		
//-------------------Scenario 2, Reserve a Return Ticket----------
		reservationPage.enterToPort(ConstantVariables.ToPort);
		reservationPage.enterFromPort(ConstantVariables.FromPort);
		reservationPage.Search();
		
		reservationPage.enterFirstName(ConstantVariables.FirstName);
		reservationPage.enterLastName(ConstantVariables.LastName);
		
		reservationPage.enterCreditcardNo(ConstantVariables.CreditcardNo);
		reservationPage.YrMo(ConstantVariables.Mo,ConstantVariables.Yr);
		reservationPage.enterccFirstName(ConstantVariables.ccFirstName);
		reservationPage.enterccLastName(ConstantVariables.ccLastName);
	
	    reservationPage.Buy();
	
		
/*---------------------Scenario 1, Login and book a return a return ticket----------------		
		   
		    driver.get(baseUrl + "/mercurysignon.php");
		    driver.findElement(By.name("userName")).clear();
		    driver.findElement(By.name("userName")).sendKeys("krish6635");
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    driver.findElement(By.name("login")).click();
		    
		    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
		    new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Seattle");
		    driver.findElement(By.name("findFlights")).click();
		    driver.findElement(By.name("reserveFlights")).click();
		    driver.findElement(By.name("passFirst0")).clear();
		    driver.findElement(By.name("passFirst0")).sendKeys("Krishna");
		    driver.findElement(By.name("passLast0")).clear();
		    driver.findElement(By.name("passLast0")).sendKeys("Hari");
		    driver.findElement(By.name("creditnumber")).clear();
		    driver.findElement(By.name("creditnumber")).sendKeys("3453223432");
		    new Select(driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText("02");
		    new Select(driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText("2001");
		    driver.findElement(By.name("cc_frst_name")).clear();
		    driver.findElement(By.name("cc_frst_name")).sendKeys("krishna");
		    driver.findElement(By.name("cc_last_name")).clear();
		    driver.findElement(By.name("cc_last_name")).sendKeys("Hari");
		    driver.findElement(By.name("ticketLess")).click();
		    driver.findElement(By.name("buyFlights")).click();*/
		
	}

}
