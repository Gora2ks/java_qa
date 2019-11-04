import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ryanairrepository.homepage;
import ryanairrepository.loginPage;
import java.util.concurrent.TimeUnit;
// Test_web_app class implemented in normal Page object pattern style

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
            Thread.sleep(2000);
            hp.Ticket_to_one_way().click();
//        hp.departure().click();
            hp.Departure().sendKeys("wroclaw");
            hp.Departure().sendKeys(Keys.ENTER);
            hp.Destination().sendKeys("paris B");
            hp.Destination().sendKeys(Keys.ENTER);
            Thread.sleep(1000);
            hp.Date_of_departure().click();
            hp.Passengers_input().click();
            Thread.sleep(2000);
            for (int i = 1; i < 2; i++) {
                hp.Input_adults().click();
            }
            for (int i = 0; i < 2; i++) {
                hp.Input_teens().click();
            }
            for (int i = 0; i < 1; i++) {
                hp.Input_children().click();
            }
            for (int i = 0; i < 1; i++) {
                hp.Input_infants().click();
            }


        }
    }

//        WebElement overlay = driver.findElement(By.xpath(".//input[@name='password']"));
//        js.executeScript("arguments[0].click();", overlay);;
//        overlay.sendKeys("123");
//        System.out.printf(" go");
//        lp.SubmitId().click();


//        Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
//        Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected())


//    @Test(priority = 3)
//    void homepage() {
//        WebDriver driver = new ChromeDriver();
//        homepage hp = new homepage(driver);
//
//
//
//        System.out.printf("gogodz");
//    }

    @Test(priority = 1)
    void pay() {
        int apple = 5;
        System.out.println(apple + 3.5);


    }

}

