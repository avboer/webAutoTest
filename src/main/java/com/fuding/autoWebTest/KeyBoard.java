package com.fuding.autoWebTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {

    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://wflt0.kai55.xyz");

        WebElement inputUsermane = driver.findElement(By.name("username"));

        //输入框输入内容
        inputUsermane.sendKeys("admin");
        Thread.sleep(500);

        inputUsermane = driver.findElement(By.name("password"));
        inputUsermane.sendKeys("kK69696969");

        WebElement search_setting = driver.findElement( By.xpath("//span[.='登录']"));
        Actions action = new Actions(driver);
        action.click(search_setting).perform();
        Thread.sleep(10000);

        driver.quit();
    }
}