package com.Syntax.Class8.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hw1 {
    /*
    click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
     */

    public static void main(String[] args) {

//set up property
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//create webdriver object
        WebDriver driver = new ChromeDriver();
//add implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//goto webstie
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//maximize window
        driver.manage().window().maximize();
//find webelement of checkbox and click
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
//find webelement for remove button and click
        WebElement removeBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();
//find webelement of verifty text
        WebElement textCheck = driver.findElement(By.xpath("//p[@id='message']"));
//write an if condition to find it is expected outcome with "It's gone!"

        String text = textCheck.getText();
        if(text.contains("It's gone!")) {
            System.out.println("Text verified and says: "+text);
        } else {
            System.out.println("Text does not display");
        }
// Create webdriver wait object and explicity wait location for webelement
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
// find enable button and click
        WebElement enableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableBtn.click();
// wait for element with expected conditions
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
//enter text
        textBox.sendKeys("This textbox is enable");

//click on disable button
        WebElement disableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        disableBtn.click();

        WebElement verifyTextBox = driver.findElement(By.xpath("//input[@type='text']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        System.out.println("The text box is enable :"+verifyTextBox.isEnabled());
//write an if condition to find out if "It's disabled!"
        WebElement disableText = driver.findElement(By.xpath("//p[@id='message']"));

        String text2 = disableText.getText();
        if(text2.contains("It's disabled!")) {
            System.out.println("Text verified and says: "+text2);
        } else {
            System.out.println("Text does not display");
        }

    }
}