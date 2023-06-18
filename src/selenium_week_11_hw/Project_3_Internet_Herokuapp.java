package selenium_week_11_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_3_Internet_Herokuapp {
    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        // setup browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }

        // open URL
        driver.get(baseUrl);

        // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // print the title of page
        System.out.println("The title of page  " + driver.getTitle());

        // print the current Url
        System.out.println("The current Url is : " + driver.getCurrentUrl());

        // print the page source
        System.out.println("The page source is :" + driver.getPageSource());

        // enter the email to email field
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("parikhpurvi03@gmail.com");
        // enter the password to password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("P@123");
        // close the browser
        driver.close();




    }



}
