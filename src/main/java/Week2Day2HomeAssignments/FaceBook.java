package Week2Day2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FaceBook {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Click on the create new account button
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //Enter the first name
        driver.findElement(By.name("firstname")).sendKeys("Saranya");
        //Enter the last name
        driver.findElement(By.name("lastname")).sendKeys("B");
        //Enter the mobile number
        driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
        //Enter the password
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");
        //Select the day
        WebElement dropdown = driver.findElement(By.id("day"));
        Select select = new Select(dropdown);
        select.selectByValue("18");
        //Select the month
        driver.findElement(By.id("month")).sendKeys("Jan");
        //Select the year
        driver.findElement(By.id("year")).sendKeys("1990");
        // select the gender
        driver.findElement(By.xpath("//label[text()='Female']")).click();


    }
}
