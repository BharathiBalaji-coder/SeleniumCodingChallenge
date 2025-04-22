package Week04.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getWindowHandle
	    String parentAddress = driver.getWindowHandle();
		System.out.println("The address of parent is: "+parentAddress);
       
		
		//Step1:
		//getWindowHandles
		Set<String> allAddress = driver.getWindowHandles();
		System.out.println("The set is: "+allAddress);
		
		
		//Step2:Convert set into list
		List<String> allWindowAddress=new ArrayList<String>(allAddress);
		String childAddress = allWindowAddress.get(1);
		
		String titleOfParent = driver.getTitle();
		System.out.println("Parent title is: "+titleOfParent);
		
		//Step3:
		//Switch to the child window
		driver.switchTo().window(childAddress);
		
		
		String titleOfChild = driver.getTitle();
		System.out.println("Child title is: "+titleOfChild);
		
		//driver.quit();
		
		//Switch back to the parent window
		driver.switchTo().window(allWindowAddress.get(0));
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
