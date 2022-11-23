package com.Syntax.ReviewClass4;

import org.openqa.selenium.By;
import util.BrowserManager;

import static util.BrowserManager.chromeDriver;

public class practice {
    public static void main(String[] args) {

        BrowserManager.chrome("http://facebook.com");
        chromeDriver.findElement(By.xpath(""));


    }
}
