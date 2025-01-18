package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day5MultipleClickMethodsTestCase2 {
    /*
    TESTCASE 2:
Step1: Launch the Browser and Load the URL https://gemini.google.com/
Step2: Click on the sign-in button & print the title of the Page
Step3: Close the Browser

     */

    public static void main(String[] args) {

//step1 :Open your preferred web browser
        WebDriver driver = new ChromeDriver();
        //Step 2:Go to gemini.google.com
        driver.get("https://gemini.google.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //click on sign in button
        WebElement signIn = driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
        signIn.click();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        //Step 3: close the browser
        driver.quit();
    }
}
