package com.Syntax.Class5.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
// create user email
        String userEmail="FutureSDET@gmail.com";
//        goto facebook.com simple-form-demo
        driver.get("https://www.ebay.com/");
//Maximize window
        driver.manage().window().maximize();
// print all categories on console
        List<WebElement> ebayAllCategories = driver.findElements(By.tagName("option"));
        for(WebElement categories:ebayAllCategories) {
            String categoriesList = categories.getText();
            System.out.println(categoriesList);
        }
// Find All categories drop down webelement
        WebElement allCategories = driver.findElement(By.xpath("//select[@class='gh-sb ']"));
        Select allCategoriesDD = new Select(allCategories);
// Select Computers/Tables & Networking
        allCategoriesDD.selectByVisibleText("Computers/Tablets & Networking");
// Find search button
        WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
// send keys to search bar
        searchBtn.click();
// verify the title
        WebElement title = driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));

        if(title.getText().equalsIgnoreCase("Computers, Tablets & Network Hardware")){
            System.out.println("Title verify and match ");
        } else {
            System.out.println("Title verify and does not match");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
