package org.seleniumcodingchallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {

    public static void main(String[] args) {
        // Step 1: Launch the Browser and Load the URL
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe"); // Replace with your ChromeDriver path
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.espncricinfo.com/");

        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Step 2: Click on the first result under "Key Series"
            WebElement firstKeySeries = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("(//div[contains(@class, 'ds-px-4')]//a[contains(@href, '/series')])[1]")
                    )
            );
            firstKeySeries.click();

            // Step 3: Print the text of the first resulting ad (if available)
            try {
                WebElement firstAd = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("(//div[contains(@class, 'ads')]//div)[1]") // Adjust locator based on actual ad structure
                        )
                );
                System.out.println("First Ad Text: " + firstAd.getText());
            } catch (Exception e) {
                System.out.println("No ads found or ad blocker is active.");
            }

        } catch (Exception e) {
            System.err.println("Error during execution: " + e.getMessage());
        } finally {
            // Step 4: Quit the driver
            driver.quit();
        }
    }

}
