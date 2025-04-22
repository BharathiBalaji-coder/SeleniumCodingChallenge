package Week02.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginwithXPath {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//Enter the username
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

				//Enter the password
				//To find the element
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click login button
				driver.findElement(By.className("decorativeSubmit")).click();
				
		}
	
}
