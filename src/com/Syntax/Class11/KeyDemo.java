package com.Syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KeyDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//username Text Box
       WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
//this is sending the text to the element and enum TAB it's like pressing tab on the keyboard
       userName.sendKeys("Tester", Keys.TAB);
 /* this is sendding the text to the element and enum ENTER it's like pressing enter on the password and skip finding the
        web element*/
       WebElement pass = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        pass.sendKeys("test", Keys.ENTER);



    }
}
