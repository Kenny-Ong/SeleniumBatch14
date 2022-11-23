package com.Syntax.Class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
//Maximize window
        driver.manage().window().maximize();

        // find the button click me for the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
// click on alert
        simpleAlert.click();
        Thread.sleep(2000);
//handing the alert
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();

// find the button for confirmation alert and click on it
       WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
       confirmationAlert.click();

       Thread.sleep(2000);
       Alert confirmationAlert1 = driver.switchTo().alert();
       confirmationAlert1.dismiss();


// Find the prompt alert and send some text then accept it
        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();
        Thread.sleep(2000);
        Alert promptAlert1 = driver.switchTo().alert();
        promptAlert1.sendKeys("Kenny");
        promptAlert1.accept();
    }
}
