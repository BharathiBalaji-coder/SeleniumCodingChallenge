package SeleniumHomeAssignments.Week04.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
        driver.manage().window().maximize();
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID is : " + parentWindow);
        driver.findElement(By.xpath("//span[text()='Open')]")).click();
        Set<String> childWindow = driver.getWindowHandles();
        System.out.println("child Window ID is : " + childWindow);

        String parentWindowTitle = driver.getTitle();
        System.out.println("Parent Window Title is : " + parentWindowTitle);
        List<String> childWindowaddress = new ArrayList<String>(childWindow);
        String childAddress = childWindowaddress.get(1);
        driver.switchTo().window(childAddress);
        String childWindowTitle = driver.getTitle();
        System.out.println("Child Window Title is : " + childWindowTitle);
        driver.close();


    }
}
