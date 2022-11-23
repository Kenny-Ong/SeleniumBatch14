package com.Syntax.Class10.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import util.ConfigReader;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hw {
    public static void main(String[] args) throws IOException, InterruptedException {
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

        WebElement recruitmentBtn = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitmentBtn.click();

        WebElement calendartxtBox = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calendartxtBox.click();

        WebElement monthDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selectMonth = new Select(monthDD);
        selectMonth.selectByVisibleText("Aug");

        WebElement dayDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(dayDD);
        selectYear.selectByVisibleText("2023");

        List<WebElement> dayColumn = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(int i=0; i<dayColumn.size(); i++){
            String day = dayColumn.get(i).getText();
            if(day.equalsIgnoreCase("8")) {
                WebElement dayClick = driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr/td)["+(i+1)+"]"));
                dayClick.click();
            }
        }
        Thread.sleep(2000);
        driver.close();
    }
}