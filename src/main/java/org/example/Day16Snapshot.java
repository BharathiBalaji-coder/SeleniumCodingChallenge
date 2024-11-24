package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Day16Snapshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        //Step 1: Open your preferred browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //step 2: Load the URL
        driver.get("https://www.codehim.com/demo/single-page-shopping-cart-template");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        //Step3: Select first image,click Add to cart and take a snapshot
        WebElement firstImage = driver.findElement(By.xpath("(//div[text()='Add to cart'])[1]"));
        firstImage.click();
        System.out.println("first image has been selected");
        Thread.sleep(3000);
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("C:/Users/ranga/OneDrive/Desktop/Addtocart.png");
        FileUtils.copyFile(SrcFile, DestFile);
        System.out.println("Screenshot saved to: " + DestFile.getAbsolutePath());
        System.out.println("snapshot has been taken successfully");
        //Step4: Select firstimage result and click View Gallery and take a snapshot
        WebElement firstResult = driver.findElement(By.xpath("(//div[text()='View gallery'])[1]"));
        firstResult.click();
        System.out.println("first image result has been selected");
        TakesScreenshot scrShot1 = (TakesScreenshot) driver;
        File SrcFile1 = scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1 = new File("C:/Users/ranga/OneDrive/Desktop/ViewGallery.png");
        FileUtils.copyFile(SrcFile1, DestFile1);
        System.out.println("Screenshot saved to: " + DestFile1.getAbsolutePath());
        System.out.println("snapshot has been taken successfully");
        //step 5: Quit the driver
        driver.quit();







    }
}
