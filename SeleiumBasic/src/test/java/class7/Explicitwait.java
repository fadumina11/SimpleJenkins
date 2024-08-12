package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicitwait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

       WebElement buttonForDisplay=driver.findElement(By.xpath("//button[@id='display_button']"));
     buttonForDisplay.click();
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Enabled']")));
      WebElement enableButton =driver.findElement(By.xpath("//button[text()='Enabled']"));
      enableButton.click();


      WebElement alertButton = driver.findElement(By.xpath("//button[@id='show_alert']"));
     alertButton.click();
       wait.until(ExpectedConditions.alertIsPresent());
       driver.switchTo().alert().accept();

      WebElement buttonForEnabled =driver.findElement(By.xpath("//button[@id='enable_button']"));
      buttonForEnabled.click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
      WebElement enableTheButton=driver.findElement(By.xpath("//button[text()='Button']"));
        enableTheButton.click();


    }
}
