package com.Syntax.class9.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ConfigReader;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hw1 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String path = "Data/config.properities";
        var properties = ConfigReader.read(path);
//goto website
        driver.get(properties.getProperty("URL"));
//maximize
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        login.sendKeys(properties.getProperty("userName"));

        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys(properties.getProperty("password"));

        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();

        WebElement pimEmployeeList = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimEmployeeList.click();

        List<WebElement> idColumn = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        for (int i = 0; i < idColumn.size(); i++) {
            String idNum = idColumn.get(i).getText();
            if (idNum.equalsIgnoreCase("40786A")) {
                WebElement checkbox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]"));
                checkbox.click();
            }
        }
    }
}