package org.scraper.drivers;

import org.mongodb.MongoManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.scraper.by.ByFactory;
import org.scraper.drivers.DriverManager;
import org.scraper.enums.CommonTags;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class ScrapeManager extends DriverManager {



    protected WebDriver driver;
    protected String baseUrl;
    protected MongoManager mongoManager;


    /**
     * Constructor for ScrapeManager
     */
    public ScrapeManager(){
        super();
        this.driver = getDriver();
        this.mongoManager = new MongoManager();
    }

    /**
     * Constructor for ScrapeManager
     * @param baseUrl
     */
    public ScrapeManager(String baseUrl){
        super();
        this.driver = getDriver();
        this.baseUrl = baseUrl;
        this.mongoManager = new MongoManager();
    }

    /**
     * Scrapes a page and adds the scraped links to the linkAndScraped HashMap for the given url
     * @param we
     * @return
     */
    public String getLink(WebElement we){
        return we.getAttribute("href");

    }

    /**
     * Scrapes a page and adds the scraped links to the linkAndScraped HashMap
     * @param wes
     * @return
     */
    public List<String> getLinks(List<WebElement> wes){
        List<String> links = new ArrayList<String>();
        int size = wes.size();

        if(size>0){
            return wes.stream().map((we)-> we.getAttribute("href")).collect(Collectors.toList());
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
