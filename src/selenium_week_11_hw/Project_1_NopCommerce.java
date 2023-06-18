package selenium_week_11_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_1_NopCommerce {
    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {
        //1.Set up chrome browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Driver!!");
        }
        //2.Open Url
        driver.get(baseUrl);

        //3.Print the title of the page
        System.out.println("The title of the page is : " + driver.getTitle());

        //4.Print the current Url
        System.out.println("The current Url is : " + driver.getCurrentUrl());

        // 5.Print the page source
        System.out.println("The page source is : " + driver.getPageSource());

        // 6.Enter the email to email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("parikh01@gmail.com");

        // 7.Enter the password to password field
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("123!");

        // add wait to see the program
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        // close the browser
        driver.close();


    }


}
