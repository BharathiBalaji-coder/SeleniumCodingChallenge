package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Day12FrameHandling {

    public static void main(String[] args) throws InterruptedException {
        //Step 1: Open your preferred browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //step 2: navigate to the URL codepen
        driver.get("https://codepen.io/unknownUser7/pen/ZEdGLbq");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
        Thread.sleep(15000);
        //Step 3: Handle the unexpected alert
        WebElement switcherButton = driver.findElement(By.id("view-switcher-button"));
        switcherButton.click();
        System.out.println("switcher button has been clicked successfully ");
        WebElement layout = driver.findElement(By.id("left-layout"));
        layout.click();
        System.out.println("Left layout has been clicked successfully ");
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
        //Step 5:click on login button
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='loginForm']/button"));
        loginBtn.click();
        System.out.println("Login button has been clicked successfully");
        //Step 6:Alert Handling
        Alert confirm = driver.switchTo().alert();
        String confirmMessage = confirm.getText();
        System.out.println(confirmMessage);
        confirm.accept();
        //step 7: Verify the welcome text
        WebElement welcomeText = driver.findElement(By.id("welcomePage"));
        String text = welcomeText.getText();
        System.out.println(text);

    }
}
