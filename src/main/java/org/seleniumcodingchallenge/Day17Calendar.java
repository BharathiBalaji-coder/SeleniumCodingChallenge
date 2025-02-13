package org.seleniumcodingchallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day17Calendar {
    /*
    AUTOMATE THE TEST CASE FOR SELECTING TOMORROW’s DATE FROM THE CALENDAR
Step 1: Launch your preferred browser.
Step 2:  Load CheapOair website ‘https://www.cheapoair.com/’
Step 3: Choose One way trip
Step 4: Enter the From as an “MAA”
Step 5: Choose the first resulting city
Step6: Enter the To as a “DXB”
Step7: Choose the first resulting city
Step8: Choose the Depart Date as a tomorrow’s date.
Step9: Add one adult and senior in Travelers
Step10: Click the Done button
Step11: Click the Search Flights button
Step12: Close the alert
Step13: Write a logic to find the lowest price flight and print
Step14: Close the browser.

     */

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //step 2: navigate to the URL cheapoair
        driver.get("https://www.cheapoair.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //Step 3: select oneway trip
        WebElement oneWayTrip = driver.findElement(By.xpath("//label[normalize-space()='One Way']"));
        oneWayTrip.click();
        Thread.sleep(8000);
        //Step 4 : Enter the From as an “MAA”
        driver.findElement(By.id("from0")).click();
        driver.findElement(By.id("from0")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("from0")).sendKeys("MAA");
        //Step 5: Choose the first resulting city
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstFromResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@id,'from')]/../section[@class='suggestion-box']//ul/li[@data-suggestion][1]")));
        firstFromResult.click();
        Thread.sleep(2000);
        //Step 6: Step6: Enter the To as a “DXB”
        // driver.findElement(By.id("to0")).click();
        driver.findElement(By.id("to0")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("to0")).sendKeys("DXB");
        // Step7: Choose the first resulting city
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement firstTOResult = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@id,'to')]/../section[@class='suggestion-box']//ul/li[@data-suggestion][1]")));
        firstTOResult.click();
        Thread.sleep(2000);
        //Step8: Choose the Depart Date as a tomorrow’s date.
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM YYYY");
        String tomorrowDate = tomorrow.format(formatter);
        System.out.println(tomorrowDate);
        WebElement dateInput = driver.findElement(By.id("cal0"));
        dateInput.click();
        driver.findElement(By.xpath("//a[@aria-label='" + tomorrowDate + "']")).click();
        //dateInput.sendKeys(tomorrowDate);
        //dateInput.sendKeys(Keys.ENTER);
        //driver.findElement(By.id("closeCalendar")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("travellerButton")).click();
        driver.findElement(By.id("addseniors")).click();
        driver.findElement(By.id("closeDialog")).click();
        driver.findElement(By.id("searchNow")).click();
        Thread.sleep(5000);
        // driver.findElement(By.cssSelector("a.close-icon")).click();

        // Step 13: Write a logic to find the lowest price flight and print
        List<Double> numbers = new ArrayList<Double>();
        List<WebElement> elements = driver.findElements(By.xpath("//span[contains(@class,'currency') and @title]"));
        for (WebElement element : elements) {
            numbers.add(Double.parseDouble(element.getAttribute("title")));
        }
        Collections.min(numbers);
        System.out.println(numbers);
        //Quit driver
        driver.quit();

    }
}
