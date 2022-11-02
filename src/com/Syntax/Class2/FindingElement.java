package com.Syntax.Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();

        String fb = "https://www.facebook.com/";
        chrome.get(fb);
        chrome.manage().window().maximize();
        chrome.findElement(By.name("email")).sendKeys("Kenny.D.Ong@gmail.com");
        chrome.findElement(By.name("pass")).sendKeys("hello");
  /*      chrome.findElement(By.name("login")).click();*/

        chrome.findElement(By.linkText("Forgot password?")).click();
        /*chrome.findElement(By.partialLinkText("password?")).click();*/

    }
}
