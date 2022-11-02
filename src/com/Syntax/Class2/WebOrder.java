package com.Syntax.Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        chrome.manage().window().maximize();
        chrome.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        chrome.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        chrome.findElement(By.id("ctl00_MainContent_login_button")).click();

        String title= chrome.getTitle();

        if(title.equalsIgnoreCase("Web Orders")) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is wrong");
        }
        chrome.quit();
    }
}
