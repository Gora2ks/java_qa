package ryanairrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;

    }

    By login = By.xpath("//a[@ui-sref='login']");  ////a[@ui-sref='login']
    By username = By.name("emailAddress");
    By eye = By.xpath("//div[@class='eye-icon-holder']");
    By password = By.xpath(".//*[@class='core-input.ng-pristine.ng-empty.ng-invalid.ng-invalid-required.ng-touched']");
    By fieldPassword = By.xpath(".//input[@name='password']");
//    By password = By.cssSelector("input[name='password']");
    By submit = By.cssSelector("button[type='submit']");

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
    public WebElement FieldPassword(){
        return driver.findElement(fieldPassword);
}
}


