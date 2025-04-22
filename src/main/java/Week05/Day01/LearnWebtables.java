package Week05.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LearnWebtables {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://leafground.com/table.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step1: Locate the table as WebElement
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));

	
	   //To find the number of rows
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		int rowCount = allRows.size();
		System.out.println("Row count is: "+rowCount);
		
		//To find the column count
		List<WebElement> allColumn = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
		int columnCount = allColumn.size();
	    System.out.println("Column count is :"+columnCount);
	
	//To retrieve 1 single data
	WebElement row1Col1Data = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td[1]"));
    System.out.println("Row1Col1 Data: "+row1Col1Data.getText());
	
	
	//To retrieve particular row 
	List<WebElement> row1Data = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
	for (int i = 0; i < row1Data.size() ; i++) {
		//             row1Data.get(5).getText();
		String text = row1Data.get(i).getText();
		System.out.println("Row1 Data is: "+text);
	}
	
	//To retrieve the entire data
	for (int i = 1; i <= rowCount; i++) {
		WebElement row = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]"));
	for (int j = 1; j <= columnCount; j++) {
		WebElement allData = row.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
		String text = allData.getText();
		System.out.println(text);
		}
	
	}
	
	}
	

}
