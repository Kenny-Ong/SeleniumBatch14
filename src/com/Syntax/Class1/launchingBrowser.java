package com.Syntax.Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {

    public static void main(String[] args) {
/*   set the path to the driver to link it with our class on Mac you don't need
.exe on Windows you need .exe
 */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//          create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//          use the get(0 function to open up the required webstie
        driver.get("http://www.google.com");

//          get the url of the website
        String url=driver.getCurrentUrl();

//          print the url
        System.out.println(url);

//      get the title
        String title=driver.getTitle();

//          print the title
        System.out.println(title);

//      close chrome
        driver.quit(); //it will quit the whole browser
        driver.close(); //it will close the tab

    }
}
