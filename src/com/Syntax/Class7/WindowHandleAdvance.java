package com.Syntax.Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleAdvance {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

// task : goto gmail signup and get the window handle

//goto gmail sign up page

        driver.get("http://accounts.google.com/signup");

        driver.manage().window().maximize();
// click on the help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
//click on privacy button
        WebElement privacyBtn = driver.findElement((By.xpath("//a[text()='Privacy']")));
        privacyBtn.click();

// the title of my desired page is Google Account Help
// get all the window handles
     Set<String> allHandles = driver.getWindowHandles();
        for(String handle:allHandles) {
// switching the focus oto the current handle from list
        driver.switchTo().window(handle);
// get the title of the window to which teh driver has switched
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Google Account Help")){
            System.out.println("the current page under focus is : " + title);
            break;
        }
        }

// find the community button and click on it
        WebElement community = driver.findElement(By.xpath("//a[text()='Community']"));
        community.click();
    }
}