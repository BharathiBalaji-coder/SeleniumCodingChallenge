package org.seleniumcodingchallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Day22FileDownload {
    /*
   DOWNLOAD THE FILE BY USING SELENIUM WEBDRIVER

Step 1:  Launch Chrome browser in Incognito mode
Step 2: Load the URL as https://pontoon.mozilla.org/
Step 3: Click on ‘Start Localizing Now’.
Step 4: Enter ‘India’ in the Filter
Step 5: Click on ‘Bengali (India)’
Step 6: Click on Download Icon
Step 7: Click on ‘Download Terminology’.
Step 8: Save the downloaded file into the files folder under the current project directory and name it terminology.tbx
Step 9: Close the browser.

  */
    public static void main(String[] args) throws InterruptedException, AWTException {

        //Step 1:  Launch Chrome browser in Incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        //Step 2:Go to pontoon.mozilla.org website
        driver.get("https://pontoon.mozilla.org/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //Step 3: Click on ‘Start Localizing Now’.
        WebElement startLocalizingNow = driver.findElement(By.xpath("//div[@class='flex']//a[@class='button primary'][normalize-space()='Start Localizing Now']"));
        startLocalizingNow.click();
        System.out.println("Start Localizing Now has been clicked");
        // Click on Teams
        WebElement teams = driver.findElement(By.xpath("//a[normalize-space()='Teams']"));
        teams.click();
        System.out.println("Teams Menu has been clicked");
        //Step4:Enter 'India in the filter'
        WebElement filterBtn = driver.findElement(By.xpath("//input[@class='table-filter']"));
        filterBtn.click();
        filterBtn.sendKeys("India");
        System.out.println("India has been entered");
        //Step 5:click on Bengali
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement bengaliIndiaLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Bengali (India)")));
        bengaliIndiaLink.click();
        System.out.println("bengali link has been clicked");
        //Step 6: Click on Download Icon
        WebElement downloadIcon = driver.findElement(By.xpath("//i[@class='fas fa-cloud-download-alt']"));
        downloadIcon.click();
        System.out.println("Download Icon has been clicked");
        // Step 7 : Click on Download Terminology
        WebElement downloadTerminologyIcon = driver.findElement(By.xpath("//a[text()='Download Terminology']"));
        downloadTerminologyIcon.click();
        System.out.println("Download Terminology Icon has been clicked");
        //Step 8: Save the downloaded file into the files folder under the current project directory and name it terminology.tbx
        Robot robot = new Robot();
        String downloadPath = "D:\\Workspace\\SeleniumCodingChallenge\\src\\main\\resources\\terminology.tbx";
        StringSelection stringSelection = new StringSelection(downloadPath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.setAutoDelay(500);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.setAutoDelay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //Step 6: Quit the driver
        driver.quit();

    }
}
