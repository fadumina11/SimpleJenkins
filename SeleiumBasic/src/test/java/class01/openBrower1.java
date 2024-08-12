package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class openBrower1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        driver.manage().window().maximize();

        String title =driver.getTitle();
        System.out.println("The title of the page is"+ title);

        Thread.sleep(4000);
        driver.quit();

        }
    }

