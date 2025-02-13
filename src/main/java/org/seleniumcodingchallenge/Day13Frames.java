package org.seleniumcodingchallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.time.Duration;

public class Day13Frames {
    /*
    HANDLE WEBELEMENT PRESENT INSIDE THE FRAME BY USING SELENIUM WEBDRIVER
Step 1: Load the URL and open your preferred web browser
Step 2: Navigate to the URL: “https://login.salesforce.com/”
Step3: Use the following credentials for login, Username as ‘gokul.sekar@testleaf.com’ and password as ‘Leaf$123’
Step 4: Click on the App Launcher and search as ‘Opportunities’
Step 5:  Open the first available opportunity
Step6: Click on the Email icon under the Activity tab.
Step7: Enter your email ID in the To address field
Step8: Enter the content as ‘I have completed the Selenium Challenge 13’
Step9: Click on the Send button and close the browser

     */

    public static void main(String[] args) throws InterruptedException, AWTException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        WebDriver driver = new ChromeDriver(options);
        //Step 2:Go to Salesforce website
        driver.get("https://login.salesforce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //Step3: Use the following credentials for login, Username as ‘gokul.sekar@testleaf.com’ and password as ‘Leaf$123’
        WebElement userName = driver.findElement(By.id("username"));
        userName.click();
        userName.sendKeys("rangarajbharathibalaji@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("Thavan123");
        WebElement login = driver.findElement(By.id("Login"));
        login.click();
        //Step 4: Click on the App Launcher and search as ‘Opportunities’
        WebElement appLauncher = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
        appLauncher.click();
        Thread.sleep(3000);
        WebElement opportunities = driver.findElement(By.xpath("//input[starts-with(@id,'input')]"));
        opportunities.sendKeys("opportunities");
        opportunities.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        //click on the first available opportunity
        WebElement firstOpportunity = driver.findElement(By.xpath("//a[text()='Coding'] "));
        firstOpportunity.click();
        System.out.println("first available opportunity has been clicked");
        Thread.sleep(3000);
        //Click on the email icon under activity tab
        WebElement emailIcon = driver.findElement(By.xpath("//span[@value='SendEmail']"));
        emailIcon.click();
        System.out.println("email icon has been clicked");

        //Enter your email id in the To address field
        WebElement toField = driver.findElement(By.xpath("(//input[@role='combobox'])[1]"));
        toField.click();
        toField.sendKeys("rangarajbharathibalaji@gmail.com");
        System.out.println("To Field has been clicked and email id has been entered");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='CK Editor Container']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Email Body']")));
        driver.findElement(By.xpath("//body[@aria-label='Email Body']")).sendKeys("I have completed the Selenium Challenge 13");
        driver.switchTo().defaultContent();
        WebElement sendBtn = driver.findElement(By.xpath("//span[text()='Send']/parent::button"));
        sendBtn.click();
        System.out.println("Email has been sent successfully");
        //Close the browser
        driver.quit();

    }
}
