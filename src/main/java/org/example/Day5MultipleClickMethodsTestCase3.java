package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Day5MultipleClickMethodsTestCase3 {
    /*
    TESTCASE3:
Step1: Launch the Browser and Load the URL https://petdiseasealerts.org/forecast-map#/.
Step2: Select Tick Borne disease under Heart Worm
Step3: Close the Browser

     */

    public static void main(String[] args) throws InterruptedException {

        //step1 :Open your preferred web browser
        WebDriver driver = new ChromeDriver();
        //Step 2:Go to petdiseasealerts
        driver.get("https://petdiseasealerts.org/forecast-map#");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
        driver.switchTo().frame(frame);
        WebElement intestinalParasite = driver.findElement(By.xpath("//a[text()='Intestinal Parasites']"));
        Actions act = new Actions(driver);
        act.moveToElement(intestinalParasite).perform();

        WebElement tickBorneDiseaseOption = driver.findElement(By.xpath("//span[text()='Tick Borne Disease Agents']"));
        act.moveToElement(tickBorneDiseaseOption).click(tickBorneDiseaseOption).perform();
        System.out.println("Clicked on Tick Borne Disease Agents");
       //close the browser
        driver.quit();

    }


}

