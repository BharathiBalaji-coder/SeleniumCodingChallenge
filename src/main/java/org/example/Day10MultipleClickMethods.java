package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Day10MultipleClickMethods {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //Step 1:Go to Salesforce website
        driver.get("https://login.salesforce.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //step 2 : Login to the application
        WebElement userName = driver.findElement(By.id("username"));
        userName.click();
        userName.sendKeys("vinothkumar@testleaf.com");

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("SeleniumChallenge@24");

        WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
        Login.click();
        System.out.println("Login button has been clicked successfully");
        Thread.sleep(8000);
        //Step 3: CLick App Manager by search "App Manager"

        WebElement AppManager = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
        AppManager.click();
        AppManager.sendKeys("App Manager");
        AppManager.sendKeys(Keys.ENTER);
        System.out.println("App Manager has been entered in the QuickFind Input");

        WebElement AppManagerInput = driver.findElement(By.xpath("//mark[@class='highlight']"));
        AppManagerInput.click();
        System.out.println("App Manager link has been clicked successfully");

        //Step 4 :Click on New connected APp

        WebElement newConnectedApp = driver.findElement(By.xpath("//span[normalize-space()='New Connected App']"));
        newConnectedApp.click();
        System.out.println("New Connected App has been clicked successfully");
        Thread.sleep(3000);
        //step 5: Click to view the page in salesforce classic
        WebElement profileIcon = driver.findElement(By.xpath("//span[@class='uiImage']"));
        profileIcon.click();
        System.out.println("profile icon has been clicked successfully");

        WebElement classicView = driver.findElement(By.xpath("//a[normalize-space()='Switch to Salesforce Classic']"));
        classicView.click();
        System.out.println("classic view icon has been clicked");

        WebElement lightningView = driver.findElement(By.xpath("//a[@class='switch-to-lightning']"));
        lightningView.click();
        System.out.println("Lightning view has been clicked");
        driver.close();







    }

}
