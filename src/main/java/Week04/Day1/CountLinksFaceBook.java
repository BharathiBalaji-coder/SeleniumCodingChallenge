package Week04.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class CountLinksFaceBook {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("The links in the page are :" + allLinks);
        int size = allLinks.size();
        System.out.println("The number of links in the page are :" + size);

        for (WebElement link : allLinks) {
            System.out.println(link.getText());
        }
        List<String> allLinksText = driver.findElements(By.tagName("a")).stream().map(WebElement::getText).toList();
        System.out.println("The links in the page are :" + allLinksText);

        List<String> allLinksText1 = new ArrayList<>();
        for (WebElement link : allLinks) {
            allLinksText1.add(link.getText());
        }
        System.out.println("The links in the page are :" + allLinksText1);
        driver.quit();
    }
}
