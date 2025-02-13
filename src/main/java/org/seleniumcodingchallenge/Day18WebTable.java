package org.seleniumcodingchallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day18WebTable {
    /*
    READ THE RESPECTIVE VALUE FROM THE WEB TABLE FOR GIVEN INPUT
Step 1: Open your preferred web browser
Step 2: Navigat to the URL: https://finance.yahoo.com/most-active
Step 3: Identify the minimum value among the prices listed
Step 4: Print the company name, price and market cap for the company with the lowest price.

     */

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //step 2: navigate to the URL finance.yahoo.com
        driver.get("https://finance.yahoo.com/most-active");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        //step 3: Identify the minimum value among the prices listed
//        List<Double> numbers = new ArrayList<Double>();
//        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='scr-res-table']//table/tbody/tr/td[starts-with(@aria-label,'Price')]/fin-streamer"));
//        for (WebElement element : elements) {
//            numbers.add(Double.valueOf(element.getAttribute("value")));
//        }
//        Collections.min(numbers);
//        System.out.println(numbers);

        List<WebElement> priceElements = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
        List<Double> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replace(",", "").trim();
            double price = Double.parseDouble(priceText);
            prices.add(price);
        }
        double minPrice = Collections.min(prices);

        // Step 4: Print the company name, price and market cap for the company with the lowest price
        int minPriceIndex = prices.indexOf(minPrice);
        WebElement minPriceRow = driver.findElement(By.xpath("//table/tbody/tr[" + (minPriceIndex + 1) + "]"));
        String companyName = minPriceRow.findElement(By.xpath("td[1]")).getText();
        String marketCap = minPriceRow.findElement(By.xpath("td[7]")).getText();

        System.out.println("Company Name: " + companyName);
        System.out.println("Price: $" + minPrice);
        System.out.println("Market Cap: " + marketCap);

    }
}
