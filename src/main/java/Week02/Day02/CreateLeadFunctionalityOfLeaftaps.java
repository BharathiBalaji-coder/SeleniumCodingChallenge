package Week02.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunctionalityOfLeaftaps {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Enter FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		
		
		//Enter the LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		//Handling Dropdown
		
		//Step1: Find the element
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step2: Create object for Select Class
		Select dropdown1=new Select(sourceDD);
		
		//Step3: Select the option
		//selectByIndex
		//dropdown1.selectByIndex(4);
		
		//selectByVisibleText
		//dropdown1.selectByVisibleText("Partner");
		
		//selectByValue
		dropdown1.selectByValue("LEAD_DIRECTMAIL");
		
		//Click createlead button
		driver.findElement(By.name("submitButton")).click();
		
	}

}
