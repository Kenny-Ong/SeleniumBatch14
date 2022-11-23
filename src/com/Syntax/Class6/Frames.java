package com.Syntax.Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://chercher.tech/practice/frames");
//Maximize window
        driver.manage().window().maximize();

// Task 1: select Baby cat from the dropdown

// Step1: switch to the frame using index

        driver.switchTo().frame(1);

        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text = animalText.getText();
        System.out.println(text);
//  used dropdop item
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Baby Cat");

//check box
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
//TextBox
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//iframe[@id='frame3']/preceding-sibling::input"));
        textBox.sendKeys("All about frames");

    }
}
