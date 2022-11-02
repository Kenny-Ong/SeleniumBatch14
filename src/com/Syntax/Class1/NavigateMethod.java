package com.Syntax.Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    // goto google.com
    //goto fb.com
    // goto google.com
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
       // create the Webdriver isntance
        WebDriver driver = new ChromeDriver();
        //goto google.com

        for (int i=0; i<3; i++) {

            driver.get("http://www.google.com");
            //goto facebook.com
            driver.navigate().to("http://www.facebook.com");
            //introduce some sleep which is wait
            //wait or pause for 2000 mili seconds (2 sec)
            Thread.sleep(2000);
            //go back to google.com
            driver.navigate().back();
            //go back to fb.com
            Thread.sleep(2000);
            driver.navigate().forward();
            //refresh page
            Thread.sleep(2000);
            driver.navigate().refresh();
        }
        driver.quit();

    }
}
