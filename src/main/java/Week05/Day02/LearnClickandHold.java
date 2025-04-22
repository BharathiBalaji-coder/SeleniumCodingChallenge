package Week05.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class LearnClickandHold {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(0);
		
		//Find Element1
		WebElement element1 = driver.findElement(By.xpath("//li[text()='Item 1']"));

		
		
	    //Find Element2
		WebElement element2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
	
		act.clickAndHold(element1).clickAndHold(element2).perform();
	
	}

}
