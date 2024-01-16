package org.scraper.drivers;

import org.mongodb.MongoManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.scraper.drivers.DriverManager;

import java.util.List;
import java.util.stream.Collectors;


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
    public String getLink(WebElement we){
        return we.getAttribute("href");
    }
    public String[] getLinks(List<WebElement> wes){
        String[] links = {};
        int size = wes.size();

        if(size>0){
            links = new String[size];
            return wes.stream().map((we)-> we.getAttribute("href")).collect(Collectors.toList()).toArray(links);
        }
        return links;
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
