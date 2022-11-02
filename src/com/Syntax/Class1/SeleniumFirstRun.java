package com.Syntax.Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstRun {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //for windows add extension .exe
        //you can use \\
        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("https://www.amazon.com/"); //navigate to the specified url
    }
}
