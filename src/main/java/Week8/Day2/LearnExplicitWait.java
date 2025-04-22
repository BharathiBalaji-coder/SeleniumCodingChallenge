package Week8.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the URL
				driver.get("https://leafground.com/waits.xhtml");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//WebDriverWait - Class in Java
				//Declaring WebDriver wait
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
				
				WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
                until.click();
                
                //Clickable conditions
                WebElement visibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
	             //Thread.sleep(10000);
                //WebElement visibleElement = driver.findElement(By.xpath("//span[text()='I am here']"));
                boolean displayed = visibleElement.isDisplayed();
                System.out.println(displayed);
                
                //Pooling time - 500ms   -half second
              
                
	}

}
