package SeleniumHomeAssignments.Week05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearnFrames {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //click on try it button
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        //switch to alert
        driver.switchTo().alert().accept();
        WebElement text = driver.findElement(By.xpath("//p[text()='You pressed OK!']"));
        String outputText = text.getText();
        System.out.println(outputText);
        driver.quit();


    }
}
