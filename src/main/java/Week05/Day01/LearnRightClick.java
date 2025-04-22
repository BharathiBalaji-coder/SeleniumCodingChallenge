package Week05.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class LearnRightClick {

	public static void main(String[] args) {
         ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions act=new Actions(driver);
		
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(rightClickEle).perform();

	}

}
