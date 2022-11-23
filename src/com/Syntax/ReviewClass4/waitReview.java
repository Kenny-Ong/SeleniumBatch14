package com.Syntax.ReviewClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ConfigReader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class waitReview {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String path = "Data/config.properities";
        var properties = ConfigReader.read(path);
//goto website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//maximize
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement removeBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();

        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(text.getText());



    }
}
