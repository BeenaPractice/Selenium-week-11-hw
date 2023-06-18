package selenium_week_11_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_4_SauceDemo {
    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        // set up browser
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser!!");

            //2.  open URL
            driver.get(baseUrl);

            // wait url to load
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            //3. Print the title of the page
            System.out.println("The title of the page is : "  + driver.getTitle());

            //4. print the current url
            System.out.println("The current Url is : " + driver.getCurrentUrl());

            //5.print the page source
            System.out.println("The page source is : " + driver.getPageSource());

            // 6.Enter the email to Email field
            WebElement email = driver.findElement(By.id("user-name"));
            email.sendKeys("parikh03@gmail.com");

            // 7. Enter the password to password field
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("123!");

            // close the browser
            driver.close();
        }
    }

}
