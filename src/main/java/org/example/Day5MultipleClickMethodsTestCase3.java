package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Day5MultipleClickMethodsTestCase3 {

    public static void main(String[] args) throws InterruptedException {

        //step1 :Open your preferred web browser
        WebDriver driver = new ChromeDriver();
        //Step 2:Go to petdiseasealerts
        driver.get("https://petdiseasealerts.org/forecast-map#");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(5000);
        //driver.switchTo().frame("map-instance-50092");
        WebElement ele = driver.findElement(By.xpath("//a[text()='Intestinal Parasites']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        //Select tickborneagentsoption under Intestinal Parasites Menu
        WebElement tickBorneAgentsOption = driver.findElement(By.xpath("//option[contains(text(), 'Tick Borne Agents')]"));
        tickBorneAgentsOption.click();


    }


}

