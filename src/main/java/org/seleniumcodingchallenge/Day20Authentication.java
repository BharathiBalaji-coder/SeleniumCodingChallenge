package org.seleniumcodingchallenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day20Authentication {
    /*
    HANDLE BASIC AUTHENTICATION USING SELENIUM
Step1: Open your preferred web browser
Step2: Navigate to the URL: https://the-intenet.herokuapp.com/basic_auth
Step3: Need to handle the Authentication username “admin” password “admin”
Step4: Print the title of the web page to the console

     */

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
