package ryanairrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
    WebDriver driver;

    // Home Page class implemented in Page object factory method
    public homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Departure
    @FindBy(css = "span[id='lbl-flight-search-type-one-way']")
    WebElement ticket_to_one_way;

    @FindBy(css = "input[placeholder='Departure airport']")
    WebElement departure;

    //Destination
    @FindBy(css = "input[placeholder='Destination airport']")
    WebElement destination;

    @FindBy(css = "li[data-id*='15-11']")
    WebElement date_of_departure;

    public WebElement ticket_to_one_way()
    {
        return ticket_to_one_way;
    }

    public WebElement destination()
    {
        return destination;
    }

    public WebElement departure()
    {
        return departure;
    }

    public WebElement date_of_departure()
    {
        return date_of_departure;
    }


//    public WebElement Departure() {
//        return driver.findElement(destination);
//    }
//
//    public WebElement Destination() {
//        return driver.findElement(departure);
    }



