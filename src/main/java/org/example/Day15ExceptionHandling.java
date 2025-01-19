package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day15ExceptionHandling {

    /*
    Handle All the Exceptions in the Code



public class ExceptionHandling {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user_name")).sendKeys("visual_user ");
		driver.findElement(By.xpath("//input[@id='password]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("(//div[@class='login-box']//input)[2]")).click();
		WebElement click = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		driver.executeScript("agruments[0].click();", click);
		String price = driver.findElement(By.className("inventory_details_price")).getText();
		System.out.println("Price of Backpack "+price);
		String addToCart = driver.findElement(By.xpath("//button[text()='Add to cart']")).getText();
		driver.findElement(By.className("shopping_cart_badge")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Continue Shopping']/following::button")).click();
		driver.findElement(By.id("first-name")).sendKeys("Leaf");
		driver.findElement(By.name("postalCode")).sendKeys("600114");
		driver.findElement(By.xpath("//button[text()='Cancel']/following-sibling::input")).click();
		String sauceCard = driver.findElement(By.xpath("//div[text()='Payment Information:']/following-sibling::div")).getText();
		System.out.println(sauceCard);
		driver.findElement(By.xpath("//input[text()='Finish']")).click();
	}


}
*/

    public static void main(String[] args) {
        //Step 1: Launch the chrome browser and saucedemo link
        try {
            ChromeDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            //Step 2: Enter valid username and password
            WebElement userName = driver.findElement(By.id("user-name"));
            userName.click();
            userName.sendKeys("visual_user");
            //Step 3: Enter valid password
            WebElement password = driver.findElement(By.id("password"));
            password.click();
            password.sendKeys("secret_sauce");
            //Step 4: click on login button

            WebElement loginBtn = driver.findElement(By.id("login-button"));
            loginBtn.click();
            //step 4 : Click on the sauceLabs Backpack
            WebElement backpack = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']"));
            backpack.click();
            //Step 5 : Get the price of Backpack

            String price = driver.findElement(By.className("inventory_details_price")).getText();
            System.out.println("Price of Backpack " + price);
            //Step 6: click on Addtocart
            WebElement addToCart = driver.findElement(By.id("add-to-cart"));
            Thread.sleep(3000);
            addToCart.click();
            Thread.sleep(3000);
            //step 7: Click on shopping cart
            WebElement shoppingCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
            shoppingCart.click();
            System.out.println("shopping cart has been clicked ");
            //step 8: Click on continue shopping

            WebElement continueShopping = driver.findElement(By.id("continue-shopping"));
            Thread.sleep(3000);
            continueShopping.click();
            System.out.println("continue shopping has been clicked ");
            //step9: click on shopping badge
            WebElement shoppingBadge = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
            Thread.sleep(3000);
            shoppingBadge.click();
            System.out.println("shopping Badge has been clicked ");
            //step 10: click on checkout
            WebElement checkout = driver.findElement(By.id("checkout"));
            checkout.click();
            System.out.println("checkout button has been clicked");
            //Step 11: Enter firstname ,lastname and postal code
            WebElement firstName = driver.findElement(By.id("first-name"));
            firstName.click();
            firstName.sendKeys("Leaf");
            WebElement lastName = driver.findElement(By.id("last-name"));
            lastName.click();
            lastName.sendKeys("Test");
            WebElement postalCode = driver.findElement(By.id("postal-code"));
            postalCode.click();
            postalCode.sendKeys("600114");
            //step 12 : scroll
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
            //step 13: Click on continue button
            WebElement continueBtn = driver.findElement(By.id("continue"));
            continueBtn.click();
            System.out.println("continue button has been clicked");
            //step 14:payment details
            String sauceCard = driver.findElement(By.xpath("//div[text()='Payment Information:']/following-sibling::div")).getText();
            System.out.println(sauceCard);
            //step 15: finish shopping and quit the browser

            WebElement finishBtn = driver.findElement(By.xpath("//button[text()='Finish']"));
            finishBtn.click();
            System.out.println("shopping has been completed");

            // Step 16:Quit the browser
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
