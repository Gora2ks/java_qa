import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ryanairrepository.homepage;
import ryanairrepository.loginPage;

import java.util.concurrent.TimeUnit;

// Test_web_app class implemented in normal Page object pattern style

public class test_web_app {

    public static void setup()  {
        System.setProperty("webdriver.chrome.driver", "/home/ute/Documents/Work/Develop/Python/webdriver_my/chromedriver");

    }

    @Test(priority = 1)
    public void Login()  {
        WebDriver driver = new ChromeDriver();
        loginPage lp = new loginPage(driver);
        lp.Login().click();
        lp.EmailId().click();
        lp.EmailId().sendKeys("gora2ks@gmail.com");
        lp.Eye().click();
        lp.PasswordId().sendKeys("Gogodz78600");
        lp.SubmitId().click();
        driver.quit();

    }

    @Test(priority = 2)
    public void LoginInvalidPassword()   {
        WebDriver driver = new ChromeDriver();
        loginPage lp = new loginPage(driver);
        lp.Login().click();
        lp.EmailId().click();
        lp.EmailId().sendKeys("gora5ks@gmail.com");
        lp.Eye().click();
        lp.PasswordId().sendKeys("Grk2&we3");
        lp.SubmitId().click();
        lp.AlertInvalidPassword().getText();
        System.out.println(lp.AlertInvalidPassword().getText());
        Assert.assertEquals(lp.AlertInvalidPassword().getText(), "Invalid password. 0 attempts left");
        driver.quit();
    }

    @Test(priority = 3)
    public void homePageBooking() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        homepage hp = new homepage(driver);
        driver.manage().timeouts().implicitlyWait(5,
                TimeUnit.SECONDS);
        hp.Ticket_to_one_way().click();
        hp.Departure().sendKeys("wrocla");
        hp.Departure().sendKeys(Keys.ENTER);
        hp.Destination().sendKeys("paris");
        hp.Destination().sendKeys(Keys.ENTER);
        hp.Date_of_departure().click();
        hp.Passengers_input().click();
        hp.Input_adults().clear();
        hp.Input_adults().sendKeys("3");
        Thread.sleep(2000);
        hp.Passengers_input().click();
        System.out.println(hp.Passengers_input().getText());
        Assert.assertEquals(hp.Passengers_input().getText(),
                "Passengers:\n" +
                        "3 adults");
//                        " Adult (age 16+)");
//        Assert.assertEquals(driver.findElement(By.cssSelector
//                        ("div[name='passengers']")).getText(),
//                "Passengers:\n" +
//                        " Adult (age 16+)");
//        hp.Lets_go_Search().click();
//            // Create a new Page Object fo Flight reservation Part
//            flights_table_price ft = new flights_table_price(driver);
//            //          Thread.sleep(4000);
//            ft.Flights_table_price_from().click();
//            Thread.sleep(2000);
//            ft.Flights_table_fares_standard().click();
//
//            ft.Your_selected_flihgts().click();
//        driver.quit();
    }
}



