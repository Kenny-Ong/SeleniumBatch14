package com.Syntax.Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://www.ebay.com/");
//Maximize window
        driver.manage().window().maximize();
// get all the links i.e. anchor tags from teh webstie
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
//print the size of the list
        System.out.println("the size of the list is : "+ebayLinks.size());
        for(WebElement ebayLink : ebayLinks) {
// extracting the value of attribute href because it contains the link embedded in the Webelement

        String link = ebayLink.getAttribute("href");
// print the link
            System.out.println(link);
        }


    }
}
