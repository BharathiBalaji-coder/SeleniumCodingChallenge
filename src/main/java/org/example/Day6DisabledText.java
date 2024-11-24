package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Day6DisabledText {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //Step 2: Handle the notifications Add chrome switch to disable notification - "**--disable-notifications**"
        options.addArguments("--disable-notifications");
        //Step3 :
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //Step 2:Go to codepen website
        driver.get("https://codepen.io/unkownnUser7/pen/gOJEeRM");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(8000);
        //click on the change view icon
        driver.findElement(By.id("view-switcher-button")).click();
        driver.findElement(By.id("left-layout")).click();
        boolean confirmEmail = driver.findElement(By.id("confirmEmail")).isEnabled();
        System.out.println(confirmEmail);
        boolean confirmPassword = driver.findElement(By.id("confirmPassword")).isEnabled();
        System.out.println(confirmPassword);

    }
}
