package com.Syntax.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ConfigReader;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesPagination {
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



        boolean idFound=false;

        while(!idFound) {
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < idColumn.size(); i++) {
// extract teh id from the entry list
                String id = idColumn.get(i).getText();
                if (id.equalsIgnoreCase("40907A")) {
// check the checkbox associated with this particular row
                    System.out.println("i have found the id on row number " + i);
                    WebElement clickCheckBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    clickCheckBox.click();
                    idFound=true;
                    break;
                }
            }
            if(!idFound){
                WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
                nextButton.click();
            }
        }

    }
}
