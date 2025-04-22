package Week04.Day02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		//Click show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Switch to the alert
		Alert simpleAlert = driver.switchTo().alert();
		
		String text = simpleAlert.getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		simpleAlert.accept();
		
	}

}
