import net.bytebuddy.asm.Advice;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ryanairrepository.homepage;
import ryanairrepository.loginPage;

import java.util.concurrent.TimeUnit;

public class test_web_app {
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/ute/Documents/Work/Develop/Python/webdriver_my/chromedriver");
        WebDriver driver = new ChromeDriver();

        //       driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30,
                TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void Login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ryanair.com/ie/en/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        loginPage lp = new loginPage(driver);
        lp.Login().click();
        Thread.sleep(1000);
        lp.EmailId().click();
        lp.EmailId().sendKeys("gora2ks@gmail.com");
        lp.Eye().click();
        lp.PasswordId().sendKeys("Gogodz78600");
        lp.SubmitId().click();
        {
            homepage hp = new homepage(driver);
        Thread.sleep(1000);
        hp.ticket_to_one_way().click();
        hp.departure().sendKeys("wroclaw");
        hp.departure().sendKeys(Keys.ENTER);
        hp.destination().sendKeys("paris B");
        hp.destination().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        hp.date_of_departure().click();


        }
    }



 


    }

}

