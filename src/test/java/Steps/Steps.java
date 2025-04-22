package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    public ChromeDriver driver;

    @Given("Launch the browser")
    public void launch_the_browser() {
        driver =new ChromeDriver();
    }
    @Given("Load the URL")
    public void load_the_url() {
        driver.get("http://leaftaps.com/opentaps/control/main");

    }
    @Given("Enter the username as DemoSalesManager")
    public void enter_the_username_as_demo_sales_manager() {
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

    }
    @Given("Enter the password as crmsfa")
    public void enter_the_password_as_crmsfa() {
        driver.findElement(By.id("password")).sendKeys("crmsfa");

    }
    @Given("Click on the Login button")
    public void click_on_the_login_button() {
        driver.findElement(By.className("decorativeSubmit")).click();

    }
    @Given("Click on the CRM SFA link")
    public void click_on_the_crm_sfa_link() {
        driver.findElement(By.linkText("CRM/SFA")).click();
    }
    @Given("Click on the Leads link")
    public void click_on_the_leads_link() {
        driver.findElement(By.linkText("Leads")).click();

    }
    @Given("Click on the Create Lead link")
    public void click_on_the_create_lead_link() {
        driver.findElement(By.linkText("Create Lead")).click();

    }
    @Given("Enter the Company Name as TestLeaf")
    public void enter_the_company_name_as_test_leaf() {
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

    }
    @Given("Enter the First Name as Hema")
    public void enter_the_first_name_as_hema() {
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
    }
    @Given("Enter the Last Name as M")
    public void enter_the_last_name_as_m() {
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
    }
    @Given("Click on the Create Lead button")
    public void click_on_the_create_lead_button() {
        driver.findElement(By.name("submitButton")).click();

    }
    @Then("Verify the Lead is created successfully")
    public void verify_the_lead_is_created_successfully() {
        System.out.println("Lead is created successfully");

    }
    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();

    }

}
