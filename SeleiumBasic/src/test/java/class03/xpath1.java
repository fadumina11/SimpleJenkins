package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");
        WebElement userName=driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("abcdefghij");
        WebElement button=driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
       WebElement sq1 =driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
       sq1.sendKeys("what is your favorite color?");
     WebElement text =driver.findElement(By.xpath("//label[contains(text(),'ipsum ')]"));
        System.out.println(text.getText());
    }
}
