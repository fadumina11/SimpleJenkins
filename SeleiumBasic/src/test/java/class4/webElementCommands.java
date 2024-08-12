package class4;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementCommands {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement textBox=driver.findElement(By.xpath("//input[@id='textInput']"));
        textBox.clear();
        textBox.sendKeys("sgfjaerjanjfabafg");
       WebElement rb1= driver.findElement(By.xpath("//input[@value='option1']"));
        boolean selectionState=rb1.isSelected();
        if (!selectionState){
            rb1.click();
        }
        System.out.println("the rdio button is selected "+ rb1.isSelected());


        WebElement rb2=driver.findElement(By.xpath("//input[@value='option2']"));
        System.out.println("the status of the radio button being enable is "+rb2.isEnabled());
       WebElement rb3= driver.findElement(By.xpath("//input[@value='option3']"));
        System.out.println("the status of rbs3 is "+rb3.isDisplayed());

        WebElement text=driver.findElement(By.xpath("//div[@id='textElement']"));
        System.out.println( text.getText());

        WebElement attribute=driver.findElement(By.xpath("//dic[@id='attributeElement']"));
        System.out.println(attribute.getAttribute("data-custom-attribute"));
    }
}
