package SeleniumHomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1) Launch the Browser
 * 2) Load the Url "https://www.pvrcinemas.com/"
 * 3) Choose Your location as "Chennai" (sometimes it will be located automatically)
 * 4) Click on Cinema under Quick Book
 * 5) Select Your Cinema
 * 6) Select Your Date as Tomorrow
 * 7) Select Your Movie
 * 8) Select Your Show Time
 * 9) Click on Book Button
 * 10) Click Accept on Term and Condition
 * 11) Click any one available seat
 * 12) Click Proceed Button
 * 13) Print the Seat info under book summary
 * 14) Print the grand total under book summary
 * 15) Click Proceed Button
 * 16) Close the popup
 * 17) Print Your Current Page title
 * 18) Close Browser
 */

public class PVR {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.pvrcinemas.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search for city']")).sendKeys("Chennai");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
        driver.findElement(By.xpath("//span[text()='Cinema']")).click();
        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='p-dropdown-items-wrapper']//span)[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();

        // Select Your Show Time
        Thread.sleep(500);
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();

        // Click on Book Button
        driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click Accept on Term and Condition
        driver.findElement(By.xpath("//button[text()='Accept']")).click();

        // Click any one available seat
        driver.findElement(By.xpath("(//span[contains(@id,'CLUB') and @class='seat-current-pvr'])[1]")).click();

        // Click Proceed Button
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();

        // Print the Seat info under book summary
        WebElement seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']/p"));
        System.out.println("Seat Number Selected is : " + seatNumber.getText());

        // Print the grand total under book summary
        WebElement grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span"));
        String grandTotal1 = grandTotal.getText();
        System.out.println("Grand Total is : ₹" + grandTotal1);

        // Click Proceed Button
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();

        // Close the popup
        Thread.sleep(500);
        driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();

        // Print Your Current Page title
        System.out.println("Current Page Title is : " + driver.getTitle());

        // Close the browser
        driver.close();

    }
}
