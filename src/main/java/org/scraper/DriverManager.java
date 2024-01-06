package org.scraper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class DriverManager {
    private static WebDriver driver = null;

    private static char ls = File.separatorChar;
    private static String resourcePath = ""+ls+"src"+ls+"main"+ls+"resources" + ls+"drivers"+ ls+"chromedriver.exe";

    public static WebDriver getDriver(){
        if (driver != null){
            return driver;
        }
        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver",path + resourcePath);



        driver = new ChromeDriver();
        return driver;

    }

    private static ChromeOptions getChromeOptions(){
        ChromeOptions co = new ChromeOptions();
//        \

        
        return co;
    }


}
