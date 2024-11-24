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

public class Day8DropDown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //Step 1:Go to telerik.com website
        driver.get("https://www.telerik.com/contact");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //step 2: select Invoicing/Billing
        Select Dropdown = new Select(driver.findElement(By.id("Dropdown-1")));
        Dropdown.selectByValue("Invoicing/Billing");
        System.out.println("Invoice/Billing has been selected successfully");
        // Step 3: Select product
        Select product = new Select(driver.findElement(By.id("Dropdown-2")));
        product.selectByValue("Testing Framework");
        System.out.println("Testing Framework has been selected successfully");
        //Step 4 :enter first name
        WebElement firstName = driver.findElement(By.id("Textbox-1"));
        firstName.sendKeys("BharathiBalaji");
        //Step 5:enter lastname
        WebElement lastName = driver.findElement(By.id("Textbox-2"));
        lastName.sendKeys("Rangaraj");
        Thread.sleep(3000);
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        //Step 6:select country by index
        Select country = new Select(driver.findElement(By.id("Country-1")));
        country.selectByIndex(1);
        System.out.println("United states has been selected successfully");
        //step 7: Quit the driver
        driver.quit();








    }

}
