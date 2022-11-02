package com.Syntax.Class2.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Kenny");
        driver.findElement(By.name("lastname")).sendKeys("Ong");

        // "//tag[@attribute='attribute value']" <----- xpath
        // "tag[attribute='attribute value']" <----css selector
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
/*        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/img")).click();*/
           /* driver.findElement(By.cssSelector("img[class='_8idr img']")).click();*/
        driver.quit();
    }
}
