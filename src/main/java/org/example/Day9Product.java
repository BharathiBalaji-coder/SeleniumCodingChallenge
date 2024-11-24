package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day9Product {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //Step 1:Go to commerce js website
        driver.get("https://commercejs-demo-store.netlify.app");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //step 2 : Click on the shop button

        WebElement shopButton=driver.findElement(By.xpath("//a[@class='mr-4 font-color-black']"));
        shopButton.click();
        System.out.println("shop button has been clicked successfully");

        //step 3: Click on Hair products
        WebElement products=driver.findElement(By.xpath("//a[@href='/collection#hair-products']//div[@class='d-flex']//p[@class='mb-2 position-relative cursor-pointer']"));
        products.click();
        System.out.println("products under Hair products has been clicked successfully");

        //step 4: click on shampoo and conditioner set

        WebElement conditionerSet =driver.findElement(By.xpath("//p[normalize-space()='Shampoo & Conditioner Set']"));
        conditionerSet.click();
        System.out.println("Shampoo and conditioner set has been clicked successfully");

        //step 5: click on Add to cart button

        WebElement AddToCart =driver.findElement(By.xpath("//span[@class='flex-grow-1 mr-3 text-center']"));
        AddToCart.click();
        System.out.println("Shampoo and conditioner set has been added to cart");

        driver.quit();








    }

}
