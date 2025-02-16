package Week03HomeAssignmentsDay02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
        firstName.sendKeys("BharathiBalaji");
        //Enter the last name
        WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
        lastName.click();
        lastName.sendKeys("Rangaraj");
        //Enter FirstName(Local ) field using xpath
        WebElement firstNameLocal = driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
        firstNameLocal.sendKeys("Bhar");
        //Enter the department field
        WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
        department.sendKeys("IT");

        //Enter the description field
        WebElement description = driver.findElement(By.id("createLeadForm_description"));
        description.sendKeys("This is a description");

        //Enter the email in the email address field
        WebElement emailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
        emailAddress.sendKeys("rangarajbharathibalaji@gmail.com");
        //Select state or province as Newyork using visible text
        WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        stateProvince.sendKeys("New York");
        //Click on create Lead
        WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
        createLeadButton.click();
        //Verify the title of the page
        String titleOfThePage = driver.getTitle();
        System.out.println("Title of the page is: " + titleOfThePage);
        //click on the edit button
        WebElement editButton = driver.findElement(By.linkText("Edit"));
        editButton.click();
        //clear the description field
        WebElement description2 = driver.findElement(By.id("updateLeadForm_description"));
        description2.clear();
        //Fill the important note field with any text
        WebElement importantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
        importantNote.sendKeys("This is an important note");
        //Click on the update button
        WebElement updateButton = driver.findElement(By.name("submitButton"));
        updateButton.click();
        //Get the title of the Resulting page
        String resultingPageTitle = driver.getTitle();
        System.out.println("Title of the resulting page is: " + resultingPageTitle);

        //Close the browser
        driver.quit();


    }

}
