package com.Syntax.Class12;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
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

        TakesScreenshot ss = (TakesScreenshot)driver;
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminLogin.png"));


    }
}
