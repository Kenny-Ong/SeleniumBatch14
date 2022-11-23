package com.Syntax.Class5.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
// create user email
        String userEmail="FutureSDET@gmail.com";
//        goto facebook.com simple-form-demo
        driver.get("https://www.facebook.com/");
//Maximize window
        driver.manage().window().maximize();
// create account button to interact
        WebElement createBtn = driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]"));
//  click on createBtn
        createBtn.click();
// input thread sleep for elements to be available
        Thread.sleep(800);
// find webelement for first name text box
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
// sendkeys to first name text box
        firstname.sendKeys("Kenny");
// find webelement for last name text box
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
// sendkeys to mobile number or email text box
        lastname.sendKeys("Ong");
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
// sendkeys to mobile number or email text box
        email.sendKeys(userEmail);
// find Re-enter email webelement text box
        WebElement ReEnterEmail = driver.findElement(By.xpath("//input[@name= 'reg_email_confirmation__']"));
// send keys to Re-enter email text box
        ReEnterEmail.sendKeys(userEmail);
// find webelement New password text box
        WebElement newPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//send keys to New password text box
        newPassword.sendKeys("Password123");
// find birthday month dropdown webelement
// find dropdown webelement for birth month
        WebElement birthMonthDD = driver.findElement(By.xpath("//select[@id='month']"));
// Create a select object for Birth Month
        Select birthMonth = new Select(birthMonthDD);
// Use Select object to select month
        birthMonth.selectByVisibleText("Feb");
// Find Birth Day Drop down WebElement
        WebElement birthDayDD = driver.findElement(By.xpath("//select[@name='birthday_day']"));
// Create a select object for Birth Day
        Select birthDay = new Select(birthDayDD);
// Use select object to select day
        birthDay.selectByVisibleText("6");
// Find Birth Year Drop down WebElement
        WebElement birthYearDD = driver.findElement(By.xpath("//select[@id='year']"));
// Create a select object for Birth Year
        Select birthYear = new Select(birthYearDD);
// Use select object to select year
        birthYear.selectByVisibleText("1983");
// find Gender Male radio button webelement
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value='2']"));
// click on Male radio button
        maleRadioBtn.click();
        Thread.sleep(3000);
        driver.quit();


    }
}
