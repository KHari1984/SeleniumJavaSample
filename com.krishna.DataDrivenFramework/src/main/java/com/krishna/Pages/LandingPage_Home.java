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
				} /*else if (bName.equalsIgnoreCase("firefox")) {
						System.setProperty("webdriver.gecko.driver", "D:\\Selenium3.0\\geckodriver-v0.11.1-win64\\geckodriver.exe");
						driver = new FirefoxDriver();
				} else if (bName.equalsIgnoreCase("internetexplorer")) {
						driver = new InternetExplorerDriver();
				}*/
				return driver;
			  	}

		public static void  openBrowser(String url) {
			
	            driver.get(url);
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
