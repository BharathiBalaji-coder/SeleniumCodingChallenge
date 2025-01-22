package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Day12AlertsHandling {
    public static void main(String[] args) throws InterruptedException {
        //Step 1: Open your preferred web browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        WebDriver driver = new ChromeDriver(options);
        //Step 2:Go to codepen website
        driver.get("https://codepen.io/unknownUser7/pen/ZEdGLbq");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //Step 3: Handle the unexpected alert
        WebElement switcherButton = driver.findElement(By.id("view-switcher-button"));
        switcherButton.click();
        System.out.println("switcher button has been clicked");
        WebElement layout = driver.findElement(By.id("left-layout"));
        layout.click();
        System.out.println("Left layout has been clicked");
        Thread.sleep(3000);
        driver.switchTo().frame("CodePen");
        //Step 4: enter the username
        WebElement userName = driver.findElement(By.id("username"));
        userName.click();
        userName.sendKeys("user");
        //Step 4 :enter the password
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("pass");
        Thread.sleep(1000);
        //Step 5:click on login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
        loginBtn.sendKeys(Keys.ENTER);
        System.out.println("Login button has been clicked");
        Thread.sleep(1000);
        //Step 6:Alert Handling
        Alert confirm = driver.switchTo().alert();
        String confirmMessage = driver.switchTo().alert().getText();
        System.out.println(confirmMessage);
        confirm.accept();
        //step 7: Verify the welcome text
        WebElement welcomeText=driver.findElement(By.id("welcomePage"));
        String text =welcomeText.getText();
        System.out.println(text);

    }
}
