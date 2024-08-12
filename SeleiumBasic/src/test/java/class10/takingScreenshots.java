package class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;



public class takingScreenshots {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        TakesScreenshot ss= (TakesScreenshot) driver;

        File screenshot=ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screenshot/mistake.png"));

    }
}
