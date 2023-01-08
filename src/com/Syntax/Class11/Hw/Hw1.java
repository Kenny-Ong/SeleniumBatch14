package com.Syntax.Class11.Hw;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        driver.switchTo().frame("ccpa-consent-notice");
        WebElement xBtn = driver.findElement(By.xpath("//mat-icon[text()='close']"));
        xBtn.click();
        driver.switchTo().defaultContent();
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickBtn).sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        action.doubleClick(doubleClick).perform();
        Thread.sleep(2000);
        alert.dismiss();
        driver.close();
    }
}
