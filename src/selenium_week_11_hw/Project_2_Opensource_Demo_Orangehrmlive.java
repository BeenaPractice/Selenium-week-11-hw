package selenium_week_11_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_2_Opensource_Demo_Orangehrmlive {
    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //1. set up browser
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser!!");
        }
        // 2.Open Url
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3.Print the title of the page
        System.out.println("The title of the page is : " + driver.getTitle());

        //4. Print the current Url
        System.out.println("The current Url is : " + driver.getCurrentUrl());

        //5.Print the page source
        System.out.println("The page source is : " + driver.getPageSource());

        // 6.Enter the email to email field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // 7.Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //8. Close the browser
        driver.close();
    }
}
