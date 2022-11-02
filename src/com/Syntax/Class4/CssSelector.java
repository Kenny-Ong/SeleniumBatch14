package com.Syntax.Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

        driver.manage().window().maximize();

        WebElement textbox = driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textbox.sendKeys("Kenny Ong");
        WebElement button = driver.findElement(By.cssSelector("button[onclick^='showIn']"));
        button.click();

    }
}
