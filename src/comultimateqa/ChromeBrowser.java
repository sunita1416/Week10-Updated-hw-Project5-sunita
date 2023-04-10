package comultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // set up chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current URL
        driver.getCurrentUrl();
        System.out.println("Current URL :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        // Enter email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("Ssp123@gmail.com");


        // Enter password to password field

        driver.findElement(By.id("user[password]")).sendKeys("march03");


        // Close the browser
       driver.close();


    }
}
