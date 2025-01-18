package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day5MultipleClickMethodsTestCase1 {
   /*
   TESTCASE 1:
Step1: Launch the Browser and Load the URL https://my.aidaform.com/signup
Step2: Enter the Username, Email id, Password, Confirm Password
Step3: Click Create My Free Account button to submit the form
Step4: Close the Browser

    */

    public static void main(String[] args) throws InterruptedException {
        //Testcase:1
        //step1 :Open your preferred web browser
        WebDriver driver = new ChromeDriver();
        //Step 2:Go to aidaform website
        driver.get("https://my.aidaform.com/signup");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //Enter the username
        WebElement userName = driver.findElement(By.name("nickname"));
        userName.click();
        userName.sendKeys("Bala");
        //Enter the email
        WebElement email = driver.findElement(By.name("email"));
        email.click();
        email.sendKeys("bharathibalaji.b@gmail.com");
        //Enter the password
        WebElement password = driver.findElement(By.name("password"));
        password.click();
        password.sendKeys("Thavan200%");
        //Enter the confirm password
        WebElement confirmPassword = driver.findElement(By.name("confirm"));
        confirmPassword.click();
        confirmPassword.sendKeys("Thavan200%");
        //terms and conditions
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/form[1]/div[1]/label[1]/*[name()='svg'][1]")));
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/form[1]/div[1]/label[1]/*[name()='svg'][1]")).click();

        //click on create my free account
        WebElement createAccount = driver.findElement(By.xpath("//button[normalize-space()='Create My Free Account']"));
        createAccount.click();
        System.out.println("create account has been clicked successfully");
        //Step 12: close the browser
        driver.quit();

    }
}
