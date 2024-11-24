package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day20Authentication {

    public static void main(String[] args) {

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        // Open the URL with embedded credentials
        String username = "admin";
        String password = "admin";
        String baseUrl = "the-internet.herokuapp.com/basic_auth";

        // Construct the URL with embedded credentials
        String urlWithCredentials = "https://" + username + ":" + password + "@" + baseUrl;
        // Open the web page
        driver.get(urlWithCredentials);
        System.out.println(driver.getTitle());
        //Quit driver
        driver.quit();

    }
}
