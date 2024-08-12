package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

public class actionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        WebElement hoverBtn=driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action = new Actions(driver);
        action.moveToElement(hoverBtn).perform();
        Thread.sleep(2000);



       WebElement rightClick=driver.findElement(By.xpath("//button[text()='Right Click!']"));
       action.contextClick(rightClick).perform();


       WebElement dragable=driver.findElement(By.id("draggable"));
       WebElement dropLoc= driver.findElement(By.id("droppable"));
      // action.clickAndHold(dragable).moveToElement(dropLoc).release().build().perform();

       action.dragAndDrop(dragable,dropLoc).perform();





    }
}
