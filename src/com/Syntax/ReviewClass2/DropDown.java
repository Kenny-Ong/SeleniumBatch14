package com.Syntax.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
// create user email
        String userEmail="FutureSDET@gmail.com";
//        goto facebook.com simple-form-demo
        driver.get("https://www.facebook.com/");
//Maximize window
        driver.manage().window().maximize();
// create account button to interact
        WebElement createBtn = driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]"));
//  click on createBtn
        createBtn.click();
// input thread sleep for elements to be available
        Thread.sleep(800);
// find birth day webelement




    }
}
