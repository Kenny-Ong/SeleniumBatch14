package com.Syntax.ReviewClass3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertReview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();

        WebElement alertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));

        alertBtn.click();
        Thread.sleep(2000);

        //alert interface
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        Thread.sleep(2000);

        WebElement alertBtn2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        alertBtn2.click();
        alert1.accept();

        Thread.sleep(2000);
        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id=\'promtButton\']"));
        alertBtn3.click();

        alert1.sendKeys("Kenny");
        alert1.accept();
    }
}
