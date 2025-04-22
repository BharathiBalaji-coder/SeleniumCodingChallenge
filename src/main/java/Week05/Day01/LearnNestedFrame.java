package Week05.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearnNestedFrame {

	public static void main(String[] args) {
 
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Switch to the outer frame
		driver.switchTo().frame(2);
		
		//Switch to the inner frame
		driver.switchTo().frame("frame2");
		
		
		//Click the element
		driver.findElement(By.id("Click")).click();
		
		//Switch to the main web page
		driver.switchTo().defaultContent();
		
		//Switch to the parent iframe
		driver.switchTo().parentFrame();
		

	}

}
