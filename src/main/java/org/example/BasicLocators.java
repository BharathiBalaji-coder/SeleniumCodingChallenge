package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class BasicLocators {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Go to Maruti Suzuki's official website “https://www.marutisuzuki.com/”
        driver.get("https://www.marutisuzuki.com/");
        // Click the search icon.
        driver.findElement(By.className("headerSearch-btn")).click();
        // Type “Swift” in the search field and press Enter.
        driver.findElement(By.name("key")).sendKeys("Swift", Keys.ENTER);
        // Click on the General Info icon for the Swift product.
        driver.findElement(By.className("icon-general_info")).click();
        // Count the number of options in the city dropdown list.
        WebElement chooseCity = driver.findElement(By.id("selectcity1"));
        Select city = new Select(chooseCity);
        List<WebElement> options = city.getOptions();
        int size = options.size();
        System.out.println("Total Available Options: " + size);
        // Print the last option value in the city dropdown list and select it.
        String text = options.get(size - 1).getText();
        System.out.println(text);
        city.selectByVisibleText(text);
        // Click on the Safety section.
        driver.findElement(By.partialLinkText("SAFETY")).click();
        // Print the description under the Safety section.
        String technology = driver.findElement(By.className("caption- text")).getText();
        System.out.println("Technology Describtion " + technology);
        // Click on the Colours section.
        driver.findElement(By.partialLinkText("COLOURS")).click();
        // Print the currently selected color.
        String carColor = driver.findElement(By.tagName("small")).getAttribute("class");
        System.out.println("Car Color with attribute value " + carColor);
        String[] split = carColor.split("-");
        for (String string : split) {
            if (string.equals("red") || string.equals("black")) {
                System.out.println(string);
            }

        }


    }
}
