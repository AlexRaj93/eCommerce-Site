package com;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priceSliderAdjustment {
    public WebDriver driver;
    
    @BeforeTest
    public void openBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @Test
    public void customizePriceSliderReange()
    {
        driver.navigate().to("http://automationpractice.com/index.php");
        if(driver.findElement(By.className("login")).isDisplayed())
        {
            System.out.println("You are in login Page");
        }
        driver.findElement(By.className("login")).click();
        driver.findElement(By.xpath(".//*[@id='email']")).clear();
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("xxx123@ymail.com");
        driver.findElement(By.xpath(".//*[@id='passwd']")).clear();
        driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("103069123");
        driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
        String Username = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).getText();
        if(Username.equalsIgnoreCase("Tester QA"))
        {
            System.out.println("Login Successful");
        }
        //Navigate to Home page
        driver.findElement(By.xpath(".//*[@id='columns']/div[1]/a/i")).click();
        //Click Dresses Page
        driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
        List<WebElement> TotalDresses = driver.findElements(By.xpath("//ul[@id='homefeatured']/li"));
        for(int DressCount=1; DressCount<TotalDresses.size(); DressCount++)
        {
            
        }
        
    }
}

