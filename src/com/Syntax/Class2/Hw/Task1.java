package com.Syntax.Class2.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Kenny");
        driver.findElement(By.name("customer.lastName")).sendKeys("Ong");
        driver.findElement(By.name("customer.address.street")).sendKeys("123 Street Lane");
        driver.findElement(By.name("customer.address.city")).sendKeys("Los Angeles");
        driver.findElement(By.name("customer.address.state")).sendKeys("California");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("90210");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("626-123-3412");
        driver.findElement(By.name("customer.ssn")).sendKeys("123-45-1234");
        driver.findElement(By.name("customer.username")).sendKeys("KINGKONG");
        driver.findElement(By.name("customer.password")).sendKeys("password");
        driver.findElement(By.name("repeatedPassword")).sendKeys("password");
        driver.findElement(By.className("button")).click();

        driver.quit();
    }
}
