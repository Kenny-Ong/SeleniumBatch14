package com.Syntax.Class4.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D”");
//Maximize window
        driver.manage().window().maximize();
//find webelement for login and login with correct username
        WebElement login = driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
        login.sendKeys("Admin");
//find webelement and click on login button
        WebElement loginbtn = driver.findElement(By.xpath("//input[@id=\"btnLogin\"]"));
        loginbtn.click();
//Find webelement for empty password and write an if condition to for message is dislayed
        WebElement passcodeEmpty = driver.findElement(By.xpath("//span[@id=\"spanMessage\"]"));
      if(passcodeEmpty.getText().equalsIgnoreCase("Password cannot be empty")) {
          System.out.println("Password cannot be empty is displayed");
      } else {
          System.out.println("Passcode has been entered wrong");
      }
    }
}
