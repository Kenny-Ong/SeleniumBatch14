package com.Syntax.class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MakingMethodOnTables {
    public static void main(String[] args) {

     MakingMethodOnTables.clickCheckBoxBaseOffProduct("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx", "FamilyAlbum");

// traverse through the list

    }
    public static void clickCheckBoxBaseOffProduct(String website, String product){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//goto website
        driver.get(""+website+"");
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
        List<WebElement> dataInProductColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));


        //traverse through the List
        for(int i = 0; i<dataInProductColumn.size(); i++) {
            String text = dataInProductColumn.get(i).getText();
            if(text.equalsIgnoreCase("ScreenSaver")) {
                List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
                allCheckBoxes.get(i).click();
            }
        }
    }
}
