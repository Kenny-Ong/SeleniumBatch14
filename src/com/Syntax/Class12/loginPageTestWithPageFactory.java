package com.Syntax.Class12;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import util.CommonMethods;

import java.io.File;
import java.io.IOException;

import static util.CommonMethods.driver;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) throws InterruptedException, IOException {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22)");
        loginPageWithPageFactory login = new loginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs((OutputType.FILE));
        FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminLogin2.png"));
        Thread.sleep(3000);
        CommonMethods.closeBrowser();

    }
}
