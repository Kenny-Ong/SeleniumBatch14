package com.Syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClassExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Actions action = new Actions(driver);

        WebElement dontSellBtn = driver.findElement(By.xpath("//mat-icon[text()='close']"));
        action.click(dontSellBtn).perform();

        WebElement yesBtn = driver.findElement(By.xpath("//span[text()='Yes']"));
        yesBtn.click();
        WebElement rightClickBtn = driver.findElement(By.xpath("span[text()='right click me']"));

        action.contextClick(rightClickBtn).perform();


    }
}
