package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {
    public static void main(String[] args) {
      WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
       WebElement email =driver.findElement(By.id("email"));
       email.sendKeys("fatush_20@hotmail.com");
      WebElement password=driver.findElement(By.name("pass"));
      password.sendKeys("pass123");
     WebElement button=driver.findElement(By.name("login"));
    // button.click();
  //using linktext
  //  WebElement createAccount=driver.findElement(By.linkText("Create new account"));
   // createAccount.click();

    // partial linktext
        WebElement createAccount=driver.findElement(By.partialLinkText("account"));
        createAccount.click();


    }

}
