package com.Syntax.Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWaits {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//goto facebook
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
// click on  create account
        WebElement createNewAcct = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAcct.click();

         // send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Kenny");



    }
}