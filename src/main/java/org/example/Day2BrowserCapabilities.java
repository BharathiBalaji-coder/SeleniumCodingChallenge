package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;

public class Day2BrowserCapabilities {
    public static void main(String[] args) {
        //step1 :Open your preferred web browser
        //Create an instance of ChromeOptions class
        ChromeOptions options = new ChromeOptions();
        //Step 2: Handle the notifications Add chrome switch to disable notification - "**--disable-notifications**"
        options.addArguments("--disable-notifications");
        //Step3 :
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.spicejet.com/");
        //Step 3: Resize your browser window(1200,800)
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        //step 4: Remove info of chrome is being controlled by the software
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable automation", "disable-infobars"));
        //step 7:Get the text of flights
        WebElement flightsText = driver.findElement(By.xpath("//div[text()='Flights']"));
        String text = flightsText.getText();
        System.out.println(text);
        //Step 8: Print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        //step 9 : Close the browser
        driver.quit();
    }
}