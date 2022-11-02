package com.Syntax.Class3.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
   /*     driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();*/
        Thread.sleep(1000);
/*        driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[1]")).click();*/
        driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Simple')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Homework Complete");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
