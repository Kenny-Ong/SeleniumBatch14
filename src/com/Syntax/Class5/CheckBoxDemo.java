package com.Syntax.Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
//Maximize window
        driver.manage().window().maximize();
//find the checkbox
        WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
//click on it
        checkbox.click();
//
    }
}
