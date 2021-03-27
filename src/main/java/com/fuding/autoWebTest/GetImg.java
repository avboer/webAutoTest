package com.fuding.autoWebTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class GetImg {

    public static void main(String[] arge){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bilibili.com");

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile,new File("C:\\Users\\root\\Desktop\\webAutoTest\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}