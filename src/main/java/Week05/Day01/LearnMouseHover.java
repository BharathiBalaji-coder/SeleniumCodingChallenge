package Week05.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class LearnMouseHover {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Create Object for Actions Class
		Actions act=new Actions(driver);
		
		
		//To locate the element
		WebElement mouseHoverElement = driver.findElement(By.xpath("//span[text()='More']"));

	
	   //mouseHover - moveToElement
		act.moveToElement(mouseHoverElement).perform();
		
	}

}
