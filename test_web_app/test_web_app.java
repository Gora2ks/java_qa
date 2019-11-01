import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ryanairrepository.loginPage;
import java.util.concurrent.TimeUnit;

public class test_web_app {
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/ute/Documents/Work/Develop/Python/webdriver_my/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,
                TimeUnit.SECONDS);
    }

    @Test(priority = 3)
    public void Login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.ryanair.com/ie/en/");
 //       driver.manage().deleteAllCookies();
 //       driver.manage().window().maximize();
        loginPage lp = new loginPage(driver);
        lp.Login().click();
        Thread.sleep(500);
        lp.EmailId().click();
        lp.EmailId().sendKeys("gora2ks@gmail.com");
        Thread.sleep(3000);
        lp.Eye().click();
        WebElement overlay = driver.findElement(By.xpath(".//input[@name='password']"));
        js.executeScript("arguments[0].click();", overlay);;
        overlay.sendKeys("123");
        System.out.printf(" go");
        lp.SubmitId().click();

/* org.openqa.selenium.ElementClickInterceptedException: element click intercepted:
 Element <input name="password" class="core-input ng-pristine ng-untouched
 ng-empty ng-invalid ng-invalid-required" id="password258" placeholder="Password"
 ng-model="$ctrl.register.password" type="password" valid-password="" required="">
 is not clickable at point (461, 870). Other element would receive the click:
<p style="margin: 0px;">...</p> */
//  (Session info: chrome=78.0.3904.70)
//        Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
//        Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected())

}

    @Test(priority = 2)
    void book() {
        System.out.printf("gogodz");
    }

    @Test(priority = 1)
    void pay() {
        int apple = 5;
        System.out.println(apple + 3.5);


    }

}

