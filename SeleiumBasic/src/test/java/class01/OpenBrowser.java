package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        // instances of chromeDriver
            WebDriver driver = new ChromeDriver();
            //open the chrome browser and navigate to url
            driver.get("https://www.facebook.com/");
            //maximize the window
       driver.manage().window().maximize();
        //full screen
       // driver.manage().window().fullscreen();

        //get the title of the webpage
       String title =driver.getTitle();
        System.out.println("the title of the wepage is "+title);

        // just for observation delete after you are sure
        Thread.sleep(4000);

        // close the webpage
        driver.quit();
    }
}
