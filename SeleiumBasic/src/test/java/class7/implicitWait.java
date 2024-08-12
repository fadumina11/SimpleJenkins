package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/synchronization-waits.php");

        WebElement button1= driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
       button1.click();
       WebElement textElement=driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
       System.out.println(textElement.getText());

       WebElement button2= driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
       button2.click();
       WebElement maleButton=driver.findElement(By.xpath("//input[@value='Male']"));
       maleButton.click();


    }
}
