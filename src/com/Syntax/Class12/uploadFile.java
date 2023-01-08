package com.Syntax.Class12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// maximize window
        driver.manage().window().maximize();
// goto amazon.com
        driver.get("https://the-internet.herokuapp.com/upload");

      WebElement chooseFileBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));

      chooseFileBtn.sendKeys("C:\\Users\\kenny\\OneDrive\\Desktop\\abc.txt");

      WebElement uploadBtn = driver.findElement(By.xpath("//input[@id='file-submit']"));
      uploadBtn.click();
    }
}
