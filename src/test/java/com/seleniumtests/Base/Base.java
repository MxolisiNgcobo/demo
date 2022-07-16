package com.seleniumtests.Base;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.seleniumtests.Tests.*;

public class Base{

	public static WebDriver driver;
//	protected static Tests BasePage;

	public static void openApplication() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		// Navigate to the demoqa website
		driver.get("https://www.takealot.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 try {
			Thread.sleep(3000);
		} catch (Exception e) {
			//TODO: handle exception
		}
		System.out.println("Page loading . . .");
	}
		
	//@AfterClass
	public static void quitDriver() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			//TODO: handle exception
		}
		driver.quit();
	}
}