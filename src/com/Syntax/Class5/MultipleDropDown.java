package com.Syntax.Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com /dropDown demo
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");
//Maximize window
        driver.manage().window().maximize();
//find the Webelement that contains the select class
      WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

// using select class
        Select sel = new Select(DD);
// select by index
        sel.selectByIndex(3);
// select by visible text
        sel.selectByVisibleText("Texas");
// deselect by index
        Thread.sleep(3000);
        sel.deselectByIndex(3);
// write down the code to select all the options i teh drop down
        List<WebElement> options = sel.getOptions();

        for (int i =0; i < options.size(); i++) {
            sel.selectByIndex(i);
        }

        Thread.sleep(3000);
        sel.deselectAll();
//  how can you check if the drop down is multi select or not using selenium
        boolean multiselect= sel.isMultiple();
        System.out.println(multiselect);
    }
}
