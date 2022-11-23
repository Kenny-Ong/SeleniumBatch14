package com.Syntax.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//Maximize window
        driver.manage().window().maximize();
// find the checkBoxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));

 // what does this list contain
// it contains al the 6 webelements
        for(WebElement checkBx:checkboxes){
            String color = checkBx.getAttribute("value");
            if(color.equalsIgnoreCase("orange")){
                checkBx.click();
                break;
            }
        }


    }
}
