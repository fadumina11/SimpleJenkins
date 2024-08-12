package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

      /*
      -go to fb.com
      -send your username
     - send password
     -click on login button

       */
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        // find the element of email address and send email address to it
     WebElement email= driver.findElement(By.id("email"));
     // send text
     email.sendKeys("fatush_200@hotmail.com");
     WebElement password= driver.findElement(By.name("pass"));
     password.sendKeys("adbjjdsjjvnznljdf");
     //find the utton
   WebElement button= driver.findElement(By.name("login"));
   //click the button
 //  button.click();
     //   WebElement createAccount= driver.findElement(By.linkText("Create new account"));
      //  createAccount.click();
        WebElement createAccount= driver.findElement(By.partialLinkText("account"));
        createAccount.click();
    }
}
