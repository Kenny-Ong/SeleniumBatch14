package com.Syntax.Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableBasic {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        driver.manage().window().maximize();

// print the whole table ton the console
//table level
/*        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
        System.out.println(textAllTable);*/

// print all the rows of the table
//modification print all the rows which have the company google
// row level access
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        for (WebElement row : rows) {
            String rowText = row.getText();
            /*System.out.println(rowText);
            System.out.println("-------------------------------");*/
// modified task: print only the row which has company google
            if (rowText.contains("Google")) {
                System.out.println(rowText);
            }

        }


// print all the individual columns of the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            String columnText = column.getText();
            System.out.println(columnText);
            System.out.println("-----------------");
        }
// to find one specified column element
        WebElement Francisco = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]"));
        System.out.println(Francisco.getText());
    }
}