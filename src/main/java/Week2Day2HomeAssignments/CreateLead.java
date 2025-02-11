package Week2Day2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("username"));
        userName.click();
        userName.sendKeys("DemoSalesManager");
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("crmsfa");
        WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
        loginButton.click();
        WebElement crmLink = driver.findElement(By.linkText("CRM/SFA"));
        crmLink.click();
        // Click on the Leads tab
        WebElement leadsTab = driver.findElement(By.linkText("Leads"));
        leadsTab.click();
        // Click on Create Lead
        WebElement createLead = driver.findElement(By.linkText("Create Lead"));
        createLead.click();
        //Enter the company name
        WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
        companyName.click();
        companyName.sendKeys("TestLeaf");
        //Enter the first name
        WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
        firstName.click();
        firstName.sendKeys("Bharathi");
        //Enter the last name
        WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
        lastName.click();
        lastName.sendKeys("R");
        //Enter the Title
        WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
        title.click();
        title.sendKeys("Mr");

        //Click on create Lead
        WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
        createLeadButton.click();
        //Verify the title of the page
        String titleOfThePage = driver.getTitle();
        System.out.println("Title of the page is: " + titleOfThePage);
        //Close the browser
        driver.quit();

    }
}
