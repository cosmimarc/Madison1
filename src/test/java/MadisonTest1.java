import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MadisonTest1 {
    public static void main(String[] args) throws InterruptedException {
        /*Homepage
        1.Go to Madison site*/
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://madisonperfumery.com");

        //2.Get title
        driver.getTitle();
        System.out.println(driver.getTitle());

        //3.Get current URL
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());

        //4.Click on the logo
        WebElement logo = driver.findElement(By.cssSelector(".header-component-outer.header-middle .logo--normal >img"));
        //Thread.sleep(1000);
        logo.click();

        //5.Navigate to a different page
        driver.navigate().to("https://madisonperfumery.com/brands/");

        //6.Navigate back
        driver.navigate().back();

        //7.Navigate forward
        driver.navigate().forward();

        //8.Refresh the page
        driver.navigate().refresh();

        //9.Quit browser
        driver.quit();

        /*Account
        1.Go to Madison site*/
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://madisonperfumery.com");

        //2.Click on the account link from the header
        driver1.manage().window().maximize();
        //Thread.sleep(1000);
        WebElement account = driver1.findElement(By.cssSelector(".header_component a[href*='my-account-2']"));
        account.click();

        //3.Quit browser
        driver1.quit();







    }
}
