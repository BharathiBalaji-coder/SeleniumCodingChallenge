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

public class Day19Sorting {
    /**
     * Verify adding the lowest prices TV to cart on Monglix
     * <p>
     * TESTCASE:
     * <p>
     * > Launch the browser.
     * > Navigate to the URL: "https://www.moglix.com/".
     * > Search for "TV" using the search box.
     * > Retrieve and parse the prices of all listed TVs.
     * > Sort the list of TV prices in ascending order.
     * > Find the TV with the lowest price and add it to the cart.
     * > Open the cart.
     * > Retrieve and print the total amount in the cart.
     * > Close the browser.
     */

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //Step 1:Go to moglix.com website
        driver.get(" https://www.moglix.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        // step 2: search for TV in the search bar

        WebElement searchBar = driver.findElement(By.id("search-input"));
        //searchBar.click();
        searchBar.sendKeys("TV");
        driver.findElement(By.xpath("(//i[@class='icon-search'])[1]")).click();
        //searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //Step 3: Retrieve and parse the prices of all listed TVs.

        List<WebElement> tvPriceElements = driver.findElements(By.xpath("//div[@class='prod-selling-price']"));
        List<Double> tvPrices = new ArrayList<>();
        for (WebElement tvPriceElement : tvPriceElements) {
            String priceText = tvPriceElement.getText().replace("₹", "").replace(",", "").trim();
            double price = Double.parseDouble(priceText);
            tvPrices.add(price);
        }

        // Print the retrieved TV prices
        for (double price : tvPrices) {
            System.out.println("TV Price: ₹" + price);
        }

        //Step 4: Sort the list of TV prices in ascending order.
        Collections.sort(tvPrices);
        System.out.println("Sorted TV Prices: " + tvPrices);
        System.out.println(Collections.min(tvPrices));

        //step 5 : Find the TV with the lowest price and add it to the cart.
        double low_price = tvPrices.get(0);
        System.out.println("Lowest Price: ₹" + low_price);
        int index = tvPrices.indexOf(low_price);
        System.out.println("Index of lowest price: " + index);

        String lowestPriceText = String.valueOf(low_price);
        WebElement lowestPriceTV = driver.findElement(By.xpath("//span[contains(text(), '" + lowestPriceText + "')]/ancestor::div[@class='product-item']"));
        // click on add to cart button
        WebElement addToCartButton = lowestPriceTV.findElement(By.xpath("(//button[@class='cart-btn'])[1]"));
        addToCartButton.click();

        //view cart
        WebElement addToCart = driver.findElement(By.xpath("//p[text()='Cart']"));
        addToCart.click();

    }
}

