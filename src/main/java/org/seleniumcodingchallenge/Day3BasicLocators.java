package org.seleniumcodingchallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Day3BasicLocators {
    /**
     * Automate the following TestCase using only basic locators
     * <p>
     * TESTCASE: Maruthi Suzuki
     * <p>
     * Step 1: Open your preferred web browser.
     * Step 2: Go to Maruthi Suzuki's official website "https://www.marutisuzuki.com/".
     * Step 3: Click the search icon.
     * Step 4: Type "Swift" in the search field and press Enter.
     * Step 5: Click on the General Info icon for the Swift product.
     * Step 6: Count the number of options in the city dropdown list.
     * Step 7: Print the last options in the city dropdown list and select it.
     * Step 8: Click on the Safety section.
     * Step 9: Print the description under the Safety section.
     * Step 10: Click on the Colours section.
     * Step 11: Print the currently selected color.
     * Step 12: Close the browser.
     */

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

        Actions actions = new Actions(driver);
        //Step8: Click on the Safety section
        WebElement safetySection = driver.findElement(By.xpath("//a[normalize-space()='SAFETY']"));
        actions.moveToElement(safetySection).click().perform();
        System.out.println("Safety section is clicked");
        //step 9:Print the description under the Safety section
        System.out.println(driver.findElement(By.className("caption-text")).getText());
        //step 10.click on the colours section
        WebElement colours = driver.findElement(By.xpath("//a[normalize-space()='COLOURS']"));
        colours.click();
        System.out.println("colours section is clicked");
        // Print the currently selected color.
        String carColor = driver.findElement(By.tagName("small")).getAttribute("class");
        System.out.println("Selected Car Color: " + carColor);
        String[] split = carColor.split("-");
        for (String string : split) {
            if (string.equals("red") || string.equals("black")) {
                System.out.println(string);
            }
        }
       driver.quit();

    }
}
