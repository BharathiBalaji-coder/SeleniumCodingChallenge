package SeleniumHomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

        // 1) Launch the Browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pvrcinemas.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2)Click on cinema under Quick Book
        WebElement cinema =driver.findElement(By.xpath("//span[text()='Cinema']"));
        cinema.click();
        //3) select cinema
        WebElement selectCinema = driver.findElement(By.xpath("//span[text()='Select Cinema']"));
        selectCinema.click();
        WebElement selectCinemaLocation = driver.findElement(By.xpath("//span[normalize-space()='INOX National,Virugambakkam Chennai']"));
        selectCinemaLocation.click();
        Thread.sleep(2000);
        //4) Select Your Date as Tomorrow
        WebElement selectDate= driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]"));
        selectDate.click();
        Thread.sleep(2000);
        //5) Select Your Movie
        WebElement selectMovie = driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]"));
        selectMovie.click();
        Thread.sleep(2000);
        //6) Select Your Show Time
        WebElement selectShowTime = driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]"));
        selectShowTime.click();
        Thread.sleep(4000);
        //7) Click on Book Button
        WebElement bookButton = driver.findElement(By.xpath("//button[@aria-label='Submit']//span[@class='p-button-label p-c'][normalize-space()='Book']"));
        bookButton.click();
        Thread.sleep(2000);
        //8) Click Accept on Term and Condition
        WebElement acceptButton = driver.findElement(By.xpath("//button[text()='Accept']"));
        acceptButton.click();
        Thread.sleep(2000);
        //9) Click any one available seat
        WebElement selectSeat = driver.findElement(By.xpath("//*[@id='SL.SILVER|C:14']"));
        selectSeat.click();
        Thread.sleep(2000);
        //10) Click Proceed Button
        WebElement proceedButton = driver.findElement(By.xpath("//button[normalize-space()='Proceed']"));
        proceedButton.click();
        // Print the Seat info under book summary
        WebElement seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']/p"));
        System.out.println("Seat Number Selected is : " + seatNumber.getText());
        Thread.sleep(2000);
        // Print the grand total under book summary
        WebElement grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span"));
        String grandTotal1 = grandTotal.getText();
        System.out.println("Grand Total is : ₹" + grandTotal1);
        Thread.sleep(2000);
        // Click Proceed Button
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
          Thread.sleep(2000);
        // Close the popup

        driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();

        // Print Your Current Page title
        System.out.println("Current Page Title is : " + driver.getTitle());

        // Close the browser
        driver.quit();











    }
}
