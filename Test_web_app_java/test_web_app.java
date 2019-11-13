import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import ryanairrepository.homepage;
import ryanairrepository.loginPage;
import ryanairrepository.choosePacket;

import java.util.concurrent.TimeUnit;

// Test_web_app class implemented in normal Page object pattern style

public class test_web_app {

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/ute/Documents/Work/Develop/Python/webdriver_my/chromedriver");

    }

    @Test(priority = 1)
    public void Login() {
        WebDriver driver = new ChromeDriver();
        loginPage lp = new loginPage(driver); // define driver for LoginPage
        lp.Login().click();
        lp.EmailId().click();
        lp.EmailId().sendKeys("gora2ks@gmail.com");  //write a login or email
        lp.Eye().click();
        lp.PasswordId().sendKeys("Gogodz78600");  //write password
        lp.SubmitId().click();
        driver.quit(); // close browser

    }
    // Login with negative scenario
    @Test(priority = 2)
    public void LoginInvalidPassword() {
        WebDriver driver = new ChromeDriver();
        loginPage lp = new loginPage(driver); // define driver for LoginPage with Negative scenario
        lp.Login().click();
        lp.EmailId().click();
        lp.EmailId().sendKeys("gora5ks@gmail.com");
        lp.Eye().click();
        lp.PasswordId().sendKeys("Grk2&we3");
        lp.SubmitId().click();
        lp.AlertInvalidPassword().getText();  //get text from Alert after Submit wrong password
        System.out.println(lp.AlertInvalidPassword().getText()); // Print it out in console
        Assert.assertEquals(lp.AlertInvalidPassword().getText(), "Invalid password. 0 attempts left"); //check the text fo alert
        driver.quit();  // close browser
    }
    // Home Page class implemented in Page Object Factory method - because code on the page is more readable and simple
    @Test(priority = 3)
    public void homePageBooking() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        homepage hp = new homepage(driver); // create variable for Home Page Object Factory method

        WebDriverWait w = new WebDriverWait(driver, 7); /*explicit wait,
        waits is applied only at targetted
        elements. So no performance issues,but more code
        */
        driver.manage().timeouts().implicitlyWait(5,
                TimeUnit.SECONDS);  /*implicit wait, -  globally variable -
                covered all of target of below test,
        but Perfomance are not high */
        hp.Ticket_to_one_way().click();
        hp.Departure().sendKeys("wrocla");
        hp.Departure().sendKeys(Keys.ENTER);
        hp.Destination().sendKeys("paris");
        hp.Destination().sendKeys(Keys.ENTER);
        hp.Date_of_departure().click();
        hp.Passengers_input().click();
        hp.Input_adults().clear();
        //explicit wait
//        w.until(ExpectedConditions.elementSelectionStateToBe(By.cssSelector
        hp.Input_adults().sendKeys("3");
        Thread.sleep(2000); // Sleep it is not good practice!
        hp.Passengers_input().click();
        System.out.println(hp.Passengers_input().getText());
        Assert.assertEquals(hp.Passengers_input().getText(),
                "Passengers:\n" +
                        "3 adults");
        hp.Lets_go_Search().click();

//            // Create a new Page Object fo ChoosePacket
            choosePacket ft = new choosePacket(driver);
            ft.Flights_table_price_from().click();
            Thread.sleep(3000);
            ft.Flights_table_fares_plus_middle().click();
            ft.Your_selected_flihgts().click();
            ft.Upgrade_to_flexi_Plus().click();
            w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class*='core-btn-primary']")));
            Thread.sleep(10000);
            ft.Continue_button().click();
//        driver.quit();
    }
}



