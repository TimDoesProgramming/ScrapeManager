package org.scraper;

import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver  = DriverManager.getDriver();
        driver.get("https://www.google.com");
        System.out.println("Hello world!");
    }
}