package com.Syntax.Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) throws InterruptedException {
        //goto google.com
        //maximize your windows
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // create instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //goto google.com
        driver.get("https://www.google.com");
        //maximize window
        driver.manage().window().maximize();
        //fullscreen
       // driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.quit();


    }
}
