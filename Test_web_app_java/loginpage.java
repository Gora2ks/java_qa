package ryanairrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class loginPage {
    WebDriver driver;

    // login Page implemented in normal page object style

    public loginPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get("https://www.ryanair.com/ie/en/");
        driver.manage().timeouts().implicitlyWait(7,
                TimeUnit.SECONDS);

    }

    By login = By.xpath("//a[@ui-sref='login']");  ////a[@ui-sref='login']
    By username = By.name("emailAddress");
    By eye = By.xpath("//div[@class='eye-icon-holder']");
    By password = By.cssSelector("input[id*='password3']");
    By fieldPassword = By.xpath(".//input[@name='password']");
    By submit = By.cssSelector("button[type='submit'][class='core-btn-primary']");
    By alertInvalidPassword = By.cssSelector("ul.server-errors");

    //     tagNameid  -CSS
//    input#username
    public WebElement Login() {
        return driver.findElement(login);
    }

    public WebElement EmailId() {
        return driver.findElement(username);
    }

    public WebElement PasswordId() {
        return driver.findElement(password);
    }

    public WebElement SubmitId() {
        return driver.findElement(submit);
    }

    public WebElement Eye() {
        return driver.findElement(eye);
    }

    public WebElement AlertInvalidPassword() {
        return driver.findElement(alertInvalidPassword);
    }

}



