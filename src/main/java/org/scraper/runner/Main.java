package org.scraper.runner;

import org.scraper.page.Page;
public class Main {
    public static void main(String[] args) {
        Page page = new Page("http://www.yahoo.com");

        page.scrape();

        page.quit();
    }
}