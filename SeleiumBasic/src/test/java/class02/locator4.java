package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator4 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
         WebElement username=driver.findElement(By.className("txt"));
         username.sendKeys("Tester");
         WebElement  password=driver.findElement(By.id("ctl00_MainContent_password"));
         password.sendKeys("test");
        WebElement button=driver.findElement(By.className("button"));
        button.click();

        WebElement message=driver.findElement(By.className("login_info"));
        String text=message.getText();
        System.out.println("The text is "+ text);

        String title=driver.getTitle();
        System.out.println(title);

        if (title.equals("Web Orders")) {
            System.out.println("you logged in");
        }else {
            System.out.println("you are not logged in");
        }

    }
}
