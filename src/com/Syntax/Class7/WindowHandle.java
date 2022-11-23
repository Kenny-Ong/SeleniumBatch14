package com.Syntax.Class7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

// task : goto gmail signup and get the window handle

//goto gmail sign up page

        driver.get("http://accounts.google.com/signup");

        driver.manage().window().maximize();

//get the window handle for the current page

        String gmailHandle = driver.getWindowHandle();

// print window handle

        System.out.println(gmailHandle);
    }
}
