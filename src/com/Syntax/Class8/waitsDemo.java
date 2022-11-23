package com.Syntax.Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        driver.manage().window().maximize();
// click on the button "chagne text to selenium webDrier
        WebElement button1 = driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();

// get the text Selenium Webdriver
        WebElement webDriverText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        System.out.println(webDriverText.getText());

//Task2
//      click on the button "Display text after 10 second"
        WebElement button2 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button2.click();

        /* as teh button appears up after some time so in order to click it or get text from it,
        we need to define some explicit wait*/
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='hidden']")));

        WebElement visibleBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
        visibleBtn.click();
    }
}
