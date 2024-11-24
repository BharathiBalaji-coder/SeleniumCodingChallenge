package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day1ChromeBrowser {
    public static void main(String[] args) {
        //Launch Chrome browser in 3 different ways
        //method1 : get
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testleaf.com");
        //method2: navigate
        driver.navigate().to("https://www.testleaf.com");
        //method3: ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver1 = new ChromeDriver(options);
        driver1.get("https://www.testleaf.com");
        //method 4:
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver2 = new ChromeDriver();
        // Maximize the browser
        driver2.manage().window().maximize();
        // Launch Website
        driver2.get("https://www.testleaf.com/");


    }


}
