package com.seleniumtests.Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import com.seleniumtests.Base.*;

public class submitDetails extends Base {
    protected static WebDriver driver;
    
    public static void main(String[] args) {
       startTest();
       search();
       quitDriver();
    }

    public static void startTest()
    {    
        //Base base = new Base();
        openApplication();
        System.out.println("Application opened successfully!");
    }

    public static void search()
    {
     WebElement elements = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/form/div/div[1]/input"));
     elements.click();
     elements.sendKeys("harry porter");
    }
    
}