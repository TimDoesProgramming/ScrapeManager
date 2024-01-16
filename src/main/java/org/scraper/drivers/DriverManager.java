package org.scraper.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DriverManager {
    private static WebDriver webDriver = null;

    private static char ls = File.separatorChar;
    private static String resourcePath = ""+ls+"src"+ls+"main"+ls+"resources" + ls+"drivers"+ ls+"chromedriver.exe";

    public static WebDriver getWebDriver(){
        WebElement we;

        if (webDriver != null){
            return webDriver;
        }
        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver",path + resourcePath);

        webDriver = new ChromeDriver();
        return webDriver;

    }


    private static ChromeOptions getChromeOptions(){
        ChromeOptions co = new ChromeOptions();
//        co.setPlatformName("Windows 11");
//        co.setBrowserVersion("120");
        return co;
    }


}
