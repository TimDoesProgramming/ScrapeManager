package org.scraper.runner;

import org.mongodb.MongoManager;
import org.openqa.selenium.WebDriver;
import org.scraper.drivers.ScrapeManager;
import org.scraper.page.Page;

import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        Page page = new Page("google.com");

        page.scrape();

    }
}