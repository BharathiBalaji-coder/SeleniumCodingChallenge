package Week03HomeAssignmentsDay02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
    /*
    Requirements:
- Enter the username.
- Enter the password.
- Click the Login button.
- Click the "crm/sfa" link.
- Click the "Leads" link.
- Click "Find leads."
- Click on the "Phone" tab.
- Enter the phone number.
- Click the "Find leads" button.
- Capture the lead ID of the first resulting lead.
- Click the first resulting lead.
- Click the "Delete" button.
- Click "Find leads" again.
- Enter the captured lead ID.
- Click the "Find leads" button.
- Verify the presence of the message "No records to display" in the Lead List. This
message confirms the successful deletion.
- Close the browser.

     */

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
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
        // Click on the Find Leads link
        WebElement findLeadsLink = driver.findElement(By.linkText("Find Leads"));
        findLeadsLink.click();
        // click on the phone tab
        WebElement phoneTab = driver.findElement(By.xpath("//span[text()='Phone']"));
        phoneTab.click();
        //Enter the phone number
        WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
        phoneNumber.sendKeys("1234567890");
        //Click the "Find leads" button
        WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        findLeadsButton.click();
        Thread.sleep(3000);
        //Capture the lead ID of the first resulting lead.
        WebElement firstResultingLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        String leadId = firstResultingLead.getText();
        System.out.println("Lead ID: " + leadId);
        Thread.sleep(1000);
        //Click the first resulting lead.
        firstResultingLead.click();
        //Click the "Delete" button
        WebElement deleteButton = driver.findElement(By.linkText("Delete"));
        deleteButton.click();
        // Click "Find leads" again
        WebElement findLeadsLink2 = driver.findElement(By.linkText("Find Leads"));
        findLeadsLink2.click();
        //Enter the captured lead ID
        WebElement leadIdField = driver.findElement(By.name("id"));
        leadIdField.sendKeys(leadId);
        //Click the "Find leads" button
        WebElement findLeadsButton2 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        findLeadsButton2.click();
        Thread.sleep(3000);
        //Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
        WebElement noRecordsMessage = driver.findElement(By.xpath("//div[text()='No records to display']"));
        String message = noRecordsMessage.getText();
        System.out.println("Message: " + message);
        //Close the browser
        driver.close();


    }
}
