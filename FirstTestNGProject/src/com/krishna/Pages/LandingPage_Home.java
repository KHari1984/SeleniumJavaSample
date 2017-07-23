package com.krishna.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.krishna.ConstantValues.ConstantVariables;

public class LandingPage_Home {
	
		public static WebDriver driver;

		public static WebDriver browserType(String bName){
				if (bName.equalsIgnoreCase("chrome")) {
						System.setProperty("webdriver.chrome.driver",ConstantVariables.chromeDriverPath);
						driver = new ChromeDriver();
				} 
				return driver;
			  	}

		public static void  openBrowser(String url) {
			
	            driver.get(url);
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            
		}
		public static void closeBrowser() {
			
            driver.close();
            
	}
	   
		
	}
