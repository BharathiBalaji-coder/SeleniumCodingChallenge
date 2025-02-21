package org.seleniumcodingchallenge;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class Day11Scroll {
    /*
   AUTOMATE THE FOLLOWING TEST CASE USING DIFFERENT WAYS TO SCROLL TO AN ELEMENT  AND INTERACT

Step1: Launch the Browser and Load the URL as https://www.espncricinfo.com/
Step2:  Click on the first result under the Key Series
Step3: Print the text of the first resulting ad
Step4: Quit the driver


  */
    public static void main(String[] args) throws InterruptedException, AWTException {

        //Step 1:  Launch Chrome browser in Incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        WebDriver driver = new ChromeDriver(options);
        //Step 2:Go to espncricinfo website
        driver.get("https://www.espncricinfo.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //Step 2 :implementation of javascript executor and click on the first result under key series
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        // Step 2: Click on the first result under the Key Series
        // Click on the first result under the Key Series

        Actions actions = new Actions(driver);
        WebElement spotlight = driver.findElement(By.xpath("//span[text()='Spotlight']"));
        actions.moveToElement(spotlight).perform();
        Thread.sleep(2000);
        WebElement keySeries = driver.findElement(By.xpath("(//h2[text()='Key Series']/following::span)[2]"));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].click();", keySeries);
        //Step 4: Quit the driver
        // driver.quit();

    }
}
