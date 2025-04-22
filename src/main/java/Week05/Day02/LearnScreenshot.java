package Week05.Day02;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
       ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//3 Steps
		
		//find the element
		  WebElement usernamefield = driver.findElement(By.id("username"));
		
		
		//Step1: Take the screenshot - source
		         File source = usernamefield.getScreenshotAs(OutputType.FILE);
		
		//Step2: Set the Folder - Destination
		         File destination=new File("./Snaps/textfield.png");
		//Step3: Save the source into my destination

		    FileUtils.copyFile(source, destination);
		        		 
		        		 
	}

}
