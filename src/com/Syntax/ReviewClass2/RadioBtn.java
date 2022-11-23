package com.Syntax.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioBtn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
//Maximize window
        driver.manage().window().maximize();
//      find teh radio button

        List <WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

//      traverse through the list of webElements
                for(WebElement radioBtn:radioBtns) {
//      find the desired radio button
                    String option = radioBtn.getAttribute("value");

                    if(option.equalsIgnoreCase("5 - 15")) {
                        // click on the radio Btn
                        radioBtn.click();
                    }
                }
    }
}
