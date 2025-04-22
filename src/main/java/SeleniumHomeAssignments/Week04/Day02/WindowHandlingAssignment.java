package SeleniumHomeAssignments.Week04.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandlingAssignment {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        //Step 2: Handle the notifications Add chrome switch to disable notification - "**--disable-notifications**"
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/");
        driver.manage().window().maximize();
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID is : " + parentWindow);
        String parentWindowTitle = driver.getTitle();
        System.out.println("Parent Window Title is : " + parentWindowTitle);
        //Click on "FLIGHTS" link
        Actions actions = new Actions(driver);
        WebElement Flights = driver.findElement(By.xpath("//span[@class='allcircle circleone']"));
        actions.moveToElement(Flights).click().perform();

        //Get the window handles
        Set<String> childWindow = driver.getWindowHandles();
        System.out.println("child Window ID is : " + childWindow);

        //convert the set to list
        List<String> childWindowaddress = new ArrayList<String>(childWindow);
        String childAddress = childWindowaddress.get(1);
        driver.switchTo().window(childAddress);
        String childWindowTitle = driver.getTitle();
        System.out.println("Child Window Title is : " + childWindowTitle);
        driver.quit();
        driver.switchTo().alert();
    }
}