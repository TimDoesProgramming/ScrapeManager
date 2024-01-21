package org.crawler;

import org.scraper.drivers.ScrapeManager;
import org.scraper.page.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

public class CrawlingManager {
    Page currentPage;

    private CrawlingQueue<HashMap<String, List<String>>> urlsToCrawl;
    CrawlingManager(){
        currentPage = new Page();
        urlsToCrawl = new CrawlingQueue();
    }
    public void startCrawling(String url){
        currentPage.setBaseUrl(url);
        currentPage.scrape();
    }
    

}
