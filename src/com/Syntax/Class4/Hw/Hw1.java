package com.Syntax.Class4.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”");
//Maximize window
        driver.manage().window().maximize();
//find webelement for login and login with correct username
        WebElement login = driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
        login.sendKeys("Admin");
//find webelement for passcode and enter with correct passcode
        WebElement pws = driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
        pws.sendKeys("Hum@nhrm123");
//find webelement and click on login button
        WebElement loginbtn = driver.findElement(By.xpath("//input[@id=\"btnLogin\"]"));
        loginbtn.click();
//find webelement for Welcome Admin
        WebElement verifyElement = driver.findElement(By.xpath("//a[@id=\"welcome\"]"));
        System.out.println(verifyElement.getText());

    }
}
