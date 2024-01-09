package org.scraper;

import org.mongodb.MongoManager;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        //WebDriver driver  = DriverManager.getWebDriver();
        MongoManager.setup();
        //driver.get("https://www.google.com");
        System.out.println("Hello world!");
    }
}