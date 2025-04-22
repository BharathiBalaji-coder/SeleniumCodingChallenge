package Week04.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FindingLinks {
	
	//To count the number of Links
	//Print the Links
	//WebElement-findElements
	//  List<WebElement>

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//To get the count of Link
		int numberOfLinks = allLinks.size();
		System.out.println("Number of Links is :" +numberOfLinks);
		
		
		//Print the Links - getText() - To get the text from the WebElement
		
		List<String> allStrings=new ArrayList<String>();
		for (int i = 0; i < numberOfLinks; i++) {
			String text = allLinks.get(i).getText();
			allStrings.add(text);
		}
		
		System.out.println("The Lists is: "+allStrings);
	}

}
