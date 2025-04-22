package Week05.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class LearnScroll {

	public static void main(String[] args) {
ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions act=new Actions(driver);
		
		WebElement scrollElement = driver.findElement(By.linkText("Conditions of Use & Sale"));

	   
		act.scrollToElement(scrollElement).perform();
	}

}
