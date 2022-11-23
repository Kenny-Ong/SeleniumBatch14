package com.Syntax.Class6.Hw;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class FrameHW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        driver.manage().window().maximize();

        driver.switchTo().frame("frame2");

         WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Baby Cat");


        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//iframe[@id='frame3']/preceding-sibling::input"));
        textBox.sendKeys("DONE");

        Thread.sleep(2000);
    }
}