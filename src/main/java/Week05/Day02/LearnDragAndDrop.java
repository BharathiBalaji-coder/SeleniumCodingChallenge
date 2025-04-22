package Week05.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class LearnDragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Instantiate
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(0);
		
		//Find Drag element
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		
		//Find drop element
		WebElement destinationEle = driver.findElement(By.id("droppable"));
		
		//Use Method
		Thread.sleep(3000);
		act.dragAndDrop(sourceEle, destinationEle).perform();

	}

}

//Implicit wait
//findElement, findElements
//1 time declaration
