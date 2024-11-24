package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Day4Xpath {

    public static void main(String[] args) {
        //step1 :Open your preferred web browser
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Step 2:Go to cartify.pk
        driver.get("https://www.cartify.pk/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        //Step 3:click on shop by categories
        driver.findElement(By.xpath("//span[@class='site-nav__label'][normalize-space()='Shop By Categories']")).click();
        System.out.println("Shop by categories has been clicked successfully");

        //Step 4:click on Cloth Rack
        driver.findElement(By.xpath("//div[contains(text(),'Cloth Rack')]")).click();
        System.out.println("cloth rack has been clicked successfully");

        //Step 5:click on floor standing cloth rack with wheels
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        //identify element on scroll down
        WebElement floorclothRack = driver.findElement(By.xpath("//a[@href='/products/floor-standing-cloth-rack-with-wheels']"));
        floorclothRack.click();
        System.out.println("floor cloth rack with wheels has been clicked successfully");

        //Step 6:click on Add to cart button
        driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
        System.out.println("Add to cart button has been clicked successfully");
        //click on view cart button
        //Step 7:Retrieve the sub total price

        driver.findElement(By.xpath("//a[@class='cart-popup__cta-link btn btn--secondary-accent']")).click();
        System.out.println("view cart button has been clicked successfully");
        String price = driver.findElement(By.xpath("//dd[contains(text(),'Rs.10,500.00')]")).getText();
        System.out.println(price);

        //Step 8: close the browser
        driver.close();

    }
}
