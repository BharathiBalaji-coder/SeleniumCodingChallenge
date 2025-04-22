package SeleniumHomeAssignments.Week2Day2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
        // Click on the Accounts tab
        WebElement accountsTab = driver.findElement(By.linkText("Accounts"));
        accountsTab.click();
        // Click on Create Account
        WebElement createAccount = driver.findElement(By.linkText("Create Account"));
        createAccount.click();
        //Enter the account name
        WebElement accountName = driver.findElement(By.id("accountName"));
        accountName.click();
        accountName.sendKeys("TestLeafBharathi2");
        //Enter the description
        WebElement description = driver.findElement(By.name("description"));
        description.click();
        description.sendKeys("Selenium Automation Tester.");
        //Select "computerSoftware" as the industry
        WebElement industry = driver.findElement(By.name("industryEnumId"));
        Select dropdown = new Select(industry);
        dropdown.selectByVisibleText("Computer Software");
        //Select "S-Corporation" as the ownership
        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
        Select dropdown1 = new Select(ownership);
        dropdown1.selectByVisibleText("S-Corporation");
        //Select "Employee" as the source
        WebElement source = driver.findElement(By.name("dataSourceId"));
        Select dropdown2 = new Select(source);
        dropdown2.selectByValue("LEAD_EMPLOYEE");
        //Select e-commerce as the marketing campaign
        WebElement marketingCampaign = driver.findElement(By.name("marketingCampaignId"));
        Select dropdown3 = new Select(marketingCampaign);
        dropdown3.selectByIndex(5);
        //select Texas as the state
        WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select dropdown4 = new Select(state);
        dropdown4.selectByValue("TX");
        //Click on create account
        WebElement createAccountButton = driver.findElement(By.className("smallSubmit"));
        createAccountButton.click();

        // verify the account name is displayed

        WebElement accountName1 = driver.findElement(By.xpath("//*[starts-with(@id,'ext-gen')]"));
        String text = accountName1.getText();
        if (text.contains("TestLeafBharathi2")) {
            System.out.println("Account name is displayed correctly");
            //Close the browser
            driver.quit();


        }
    }
}
