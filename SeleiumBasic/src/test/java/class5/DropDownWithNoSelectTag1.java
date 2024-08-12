package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithNoSelectTag1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");
        WebElement DD=driver.findElement(By.xpath("//div[@data-toggle='dropdown'"));
        DD.click();
        List<WebElement> allOption=driver.findElements(By.xpath("//ul[@class= 'dropdown-menu']/li/a"));
for (WebElement options:allOption){
   String option=options.getText();
    if (option.equalsIgnoreCase("Japan")){
        options.click();
        break;
    }
}
    }
}
