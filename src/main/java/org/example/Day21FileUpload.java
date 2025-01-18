package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Day21FileUpload {
    /*
    AUTOMATE THE FOLLOWING TEST CASE FOR USING FILE UPLOAD
  Step1: Open your preferred web browser
  Step2: Go to the I Love PDF official website https://www.ilovepdf.com
  Step3: Click the PDF to Wod
  Step4: Click the Select PDF
  Step5: Upload your PDF file
  */
    public static void main(String[] args) throws InterruptedException, AWTException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("window-size=1200,800");
        WebDriver driver = new ChromeDriver(options);
        //Step 1:Go to telerik.com website
        driver.get("https://www.ilovepdf.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        WebElement pdfToWord = driver.findElement(By.xpath("//h3[normalize-space()='PDF to Word']"));
        pdfToWord.click();
        WebElement selectPDFFile=driver.findElement(By.xpath("//span[normalize-space()='Select PDF file']"));
        selectPDFFile.click();
        Thread.sleep(3000);
        Robot robot = new Robot();
        StringSelection s = new StringSelection("C:\\Users\\ranga\\OneDrive\\Desktop\\Solvesanything.pdf");
        Thread.sleep(3000);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        System.out.println("File has been uploaded successfully");
        //Step 6: Quit the driver
        driver.quit();

    }
}
