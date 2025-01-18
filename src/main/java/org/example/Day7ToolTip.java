package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Day7ToolTip {

    public static void main(String[] args) throws InterruptedException {
//step1 :Open your preferred web browser
        WebDriver driver = new ChromeDriver();
        //Step 2:Go to mapz website
        driver.get("https://www.mapz.com/map");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //step 4: click on the draw tab from the right side menu
        WebElement drawMenu = driver.findElement(By.xpath("//a[normalize-space()='Draw']"));
        drawMenu.click();
        System.out.println("Draw menu has been clicked successfully");
        Thread.sleep(2000);


        WebElement element = driver.findElement(By.name("email"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        String toolTipText =element.getAttribute("validationMessage");
        System.out.println("Tooltip message: " + toolTipText);
    }
}
