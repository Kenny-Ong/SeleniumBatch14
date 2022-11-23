package com.Syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
// switch the focus to the iFrame
        driver.switchTo().frame((0));
//        dragable
        WebElement dragableElement = driver.findElement(By.xpath("//div[@id='draggable']"));
//        drop location
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);
 //       action.dragAndDrop(dragableElement,dropLocation).perform();
        /*another method is to click and hold the element and drag to location then release. This
        methods how you can chain build the methods together */
        action.clickAndHold(dragableElement).moveToElement(dropLocation).release().build().perform();
    }
}
