package org.scraper.page;

import org.mongodb.DocumentTool;
import org.openqa.selenium.WebElement;
import org.scraper.by.ByFactory;
import org.scraper.drivers.ScrapeManager;
import org.scraper.enums.CommonTags;

import java.util.HashMap;
import java.util.List;

public class Page extends ScrapeManager {

    private String url;

    public  String getUrl() {
        return url;
    }

    public  HashMap<String, List<String>> getLinkAndScraped() {
        return linkAndScraped;
    }

    private HashMap<String, List<String>> linkAndScraped;


    public Page(){
        super();
        linkAndScraped = new HashMap<String, List<String>>();
    }
    /**
     * Constructor for Page
     * @param url
     */
    public Page(String url) {
        super(url);
        this.url = url;
        linkAndScraped = new HashMap<String, List<String>>();
    }

    /**
     * Scrapes a page and adds the scraped links to the linkAndScraped HashMap
     */
    public void scrape(){
        getDriver().get(url);
        List<WebElement> wes = driver.findElements(ByFactory.getByCommonTags(CommonTags.HREF));
        linkAndScraped.put(url, getLinks(wes));

        mongoManager.insertDocument(DocumentTool.getScrapedFromPageDoc(this));
    }

    /**
     * Scrapes a page and adds the scraped links to the linkAndScraped HashMap
     * @param url
     */
    public void scrape(String url){
        driver.get(url);
        List<WebElement> wes = driver.findElements(ByFactory.getByCommonTags(CommonTags.HREF));
        linkAndScraped.put(url, getLinks(wes));
        mongoManager.insertDocument(DocumentTool.getScrapedFromPageDoc(this));
    }
}
