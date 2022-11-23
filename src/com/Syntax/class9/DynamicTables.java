package com.Syntax.class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//goto website
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");
//maximize
        driver.manage().window().maximize();
//send keys to username
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//send keys to password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
//click on login
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
// check the checkBox that contains "screen saver"
        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
// traverse through the list
        for(int i=0; i<secondColumn.size(); i++){
            String columnText = secondColumn.get(i).getText();
                if(columnText.equalsIgnoreCase("MyMoney")){
// print out the index of the column/from which contains teh screen saver
                    System.out.println("the index of the row which contains the Screen Saver is "+(i+1));
// get the checkbox
                    //table[@class='SampleTable']/tbody/tr[2]/td[1]
                    //table[@class='SampleTable']/tbody/tr[4]/td[1]
       WebElement checkbox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]"));
       checkbox.click();

                 }
        }
    }
}
