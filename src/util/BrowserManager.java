package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class BrowserManager {

    public static WebDriver chromeDriver;
    public static WebDriver firefoxDriver;
    public static WebDriver msEdgeDriver;

    public static void chrome(String URL) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
         chromeDriver = new ChromeDriver();
         chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         chromeDriver.manage().window().maximize();
         chromeDriver.get(URL);

}
    public static void fireFox(String URL) {
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        firefoxDriver.manage().window().maximize();
        firefoxDriver.get(URL);
    }
    public static void msEdge(String URL) {
        System.setProperty("webdriver.msedge.driver", "Drivers/msedgedriver.exe");
        msEdgeDriver = new EdgeDriver();
        msEdgeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        msEdgeDriver.manage().window().maximize();
        msEdgeDriver.get(URL);
    }
}
