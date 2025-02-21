package SeleniumHomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

/**
 * estCase: 2
 * ------------
 * <p>
 * 01) Launch Chrome
 * 02) Load https://www.amazon.in/
 * add  implicitlyWait
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 * 03) Type "Bags for boys" in the Search box
 * 04) Choose the 	 item in the result (bags for boys)
 * 05) Print the total number of results (like 50000)
 * example like this-----> 1-48 of over 50,000 results for "bags for boys"
 * 06) Select the first 2 brands in the left menu
 * (like American Tourister, Generic)
 * 07) Choose New Arrivals (Sort)
 * 08) Print the first resulting bag info (name, discounted price)
 * 09) Get the page title and close the browser(driver.close())
 */
public class Amazon {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("bags for boys");
        searchBox.sendKeys(Keys.ENTER);
        WebElement text = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
        String textValue = text.getText();
        System.out.println("The first search result is: " + textValue);
        //select the first 2 brands in the left Menu

        WebElement skyBags = driver.findElement(By.xpath("//a[@aria-label='Apply the filter Skybags to narrow results']//i[@class='a-icon a-icon-checkbox']"));
        skyBags.click();
        WebElement safari = driver.findElement(By.xpath("//a[@aria-label='Apply the filter Safari to narrow results']//i[@class='a-icon a-icon-checkbox']"));
        safari.click();
        //sort by new arrivals
        WebElement sort = driver.findElement(By.xpath("//span[text()='Sort by:']"));
        sort.click();
        WebElement newArrivals = driver.findElement(By.xpath("//a[text()='Newest Arrivals']"));
        newArrivals.click();
        System.out.println("New Arrivals printed successfully");
        //Print the first resulting bag info (name, discounted price)
        List<WebElement> bagPrice = driver.findElements(By.xpath("//span[@class='a-price']"));
        System.out.println("The first resulting bag price is: " + bagPrice.get(0).getText());

        // a-link-normal s-line-clamp-2 s-link-style a-text-normal

        List<WebElement> bagName = driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));
        System.out.println("The first resulting bag name is: " + bagName.get(0).getText());
        //get the page Title
        String pageTitle = driver.getTitle();
        System.out.println("The page title is: " + pageTitle);
        driver.quit();

    }

}
