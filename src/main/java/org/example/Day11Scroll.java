package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Day11Scroll {
    public static void main(String[] args) throws InterruptedException {
        //Step 1 : Load the Browser and URL
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.espncricinfo.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //Step 2 :implementation of javascript executor and click on the first result under key series
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(8000);
        WebElement element = driver.findElement(By.xpath("//span[contains(@class,'ds-text-tight-m ds-font-regular ds-text-typo hover:ds-underline hover:ds-decoration-ui-stroke ds-block ds-mb-4 ds-text-raw-white/50')][normalize-space()='WCPL 2024']"));
        element.click();
        Thread.sleep(8000);
        System.out.println("First result under Key series element has been clicked successfully");
        driver.navigate().refresh();
        Thread.sleep(8000);
        //Step 3 : Print the text of the first resulting ad
        WebElement ad = driver.findElement(By.xpath("(//span[text()='Australia vs India'])[1]"));
        String adText = ad.getText();
        System.out.println(adText);
        //Step 4: Quit the driver
        driver.quit();





    }

}
