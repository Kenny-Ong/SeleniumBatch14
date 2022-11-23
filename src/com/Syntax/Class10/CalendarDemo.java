package com.Syntax.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ConfigReader;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class CalendarDemo {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String path = "Data/config.properities";
        driver.get("https://www.delta.com/");
//maximize
       WebElement departBtn = driver.findElement(By.xpath("//span[text()='Depart']"));
       departBtn.click();

//get the month and check if it is the desire month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        boolean isFound=false;
        while(!isFound){
            String monthName = month.getText();
            if(monthName.equalsIgnoreCase("March")) {
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
                for(WebElement date:dates){
                    String currentDate = date.getText();
                    if(currentDate.equalsIgnoreCase("11")){
                        date.click();
                        break;
                    }
                }
                System.out.println("I have found the desired month: " + monthName);
                isFound=true;
            }
            else {
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
            }
        }
    }
}
