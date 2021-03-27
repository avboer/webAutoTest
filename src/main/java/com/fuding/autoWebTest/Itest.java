package com.fuding.autoWebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\root\\Desktop\\webAutoTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wflt0.kai55.xyz");

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("driver.getPageSource()"+ driver.getPageSource());
        System.out.println("driver.getCurrentUrl()"+ driver.getCurrentUrl());
        System.out.println("driver.getWindowHandle()"+ driver.getWindowHandle());


        driver.close();
    }
}