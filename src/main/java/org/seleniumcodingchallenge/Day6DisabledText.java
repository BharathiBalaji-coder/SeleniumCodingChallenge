package org.seleniumcodingchallenge;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;

public class Day6DisabledText {

    /*
    VERIFY THE DISABLED TEXT FIELD BY USING SELENIUM WEBDRIVER
Step1: Load the URL
Step2: Open your preferred browser
Step3: Navigate to the URL: https://codepen.io/unknownUser7/pen/gOJEeRM
Step4: Click on the Change View Icon
Step5: Click on the first view option from the available choices
Step6: Verify the text field for Confirm Email and Confirm Password is disabled
Step7: Retrieve and Print the Confirm Email and Confirm Password

     */

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //Step 2: Handle the notifications Add chrome switch to disable notification - "**--disable-notifications**"
        options.addArguments("--disable-notifications");
        //Step3 :
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //Step 2:Go to codepen website
        driver.get("https://codepen.io/unkownnUser7/pen/gOJEeRM");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //click on the change view icon
        driver.findElement(By.id("view-switcher-button")).click();
        driver.findElement(By.id("left-layout")).click();
        driver.switchTo().frame("result");
        Assert.assertTrue(driver.findElement(By.id("confirmEmail")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("confirmPassword")).isDisplayed());
        System.out.println("Default value of the 'Confirm Email' Text Field in the Sign Up Form: "+driver.findElement(By.id("confirmEmail")).getAttribute("value"));
        System.out.println("Default value of the 'Confirm Password' Text Field in the Sign Up Form: "+driver.findElement(By.id("confirmPassword")).getAttribute("value"));

    }
}
