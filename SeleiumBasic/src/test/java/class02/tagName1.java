package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
       for (WebElement link:allLinks){
           String linkText=link.getAttribute("href");
           System.out.println(linkText);
       }

        }

    }

