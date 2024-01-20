package org.crawler;

import org.scraper.drivers.ScrapeManager;
import org.scraper.page.Page;

public class CrawlingManager {
    Page currentPage;

    CrawlingManager(){
        currentPage = new Page();
    }
    public void startCrawling(String url){
        currentPage.setBaseUrl(url);
        currentPage.scrape();
    }
}
