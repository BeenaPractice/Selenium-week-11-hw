package selenium_week_11_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_5_Ultimateqa {
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {
        // 1. setup Chrome browser
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser!!");
        }
        //2. Open Url
        driver.get(baseUrl);

        // 3. Print the title of the page
        System.out.println("The title of the page : " + driver.getTitle());

        //4. print the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());

        // 5. print the page source
        System.out.println("The page source : " + driver.getPageSource());

        // 6.Enter the email to email field
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("parikh03@gmail.com");

        // 7.Enter the password to password field
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("123!");

        // close the browser
        driver.close();
    }
}
