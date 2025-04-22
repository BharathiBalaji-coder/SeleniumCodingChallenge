package Week05.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearnFrames {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Switch the focus to frame
		driver.switchTo().frame(0);
		
		//Click on Clickme button
		driver.findElement(By.id("Click")).click();

	}

}
