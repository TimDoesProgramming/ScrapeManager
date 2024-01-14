package org.scraper.drivers;

import org.mongodb.MongoManager;
import org.openqa.selenium.WebDriver;
import org.scraper.drivers.DriverManager;


public class ScrapeManager extends DriverManager {



    WebDriver driver;
    String baseUrl;
    MongoManager mongoManager;

    ScrapeManager(){
        this.driver = getDriver();
    }
    ScrapeManager(String baseUrl){
        this.driver = getDriver();
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }


    public WebDriver getDriver() {
        return getWebDriver();
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }



}
