package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css2 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement input=driver.findElement(By.cssSelector("input[id='profileID']"));
        input.sendKeys("hello");
        WebElement profileBox=driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("sdhdgjgas");
       WebElement feedbackBox=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));

        feedbackBox.sendKeys("Wensite is slow");

      WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));

courseTopic.sendKeys("selenium");
WebElement intro=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
intro.sendKeys("easy");


    }
}
