package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

//        find the username text box
        WebElement inputBox = driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("helo");
        //        find the profile box
        WebElement profileBox = driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("abracadabra");
        //        coursetopic
        //        feedback
        WebElement feedbackBox = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackBox.sendKeys("the website is too slow");
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");
        //        /        introtoDVANCECSSS
        WebElement intro = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("easy");
    }
}
