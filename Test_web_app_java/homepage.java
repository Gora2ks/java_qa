package ryanairrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
    WebDriver driver;

    // Home Page class implemented in Page Object Factory method
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
    // Day of the Deoarture
    @FindBy(css = "li[data-id*='15-11']")
    WebElement date_of_departure;
    //Book one or more one passengers
    @FindBy(css = "div[class='dropdown-handle']")
    WebElement passengers_input;
    //Chose how many of passengers will go
    @FindBy(css = "div[value*='paxInput.adults']")
    WebElement input_adults;

    @FindBy(css = "div[value*='paxInput.teens']")
    WebElement input_teens;

    @FindBy(css = "div[value*='paxInput.children']")
    WebElement input_children;

    @FindBy(css = "div[value*='paxInput.infants']")
    WebElement input_infants;

    public WebElement Ticket_to_one_way() {
        return ticket_to_one_way;
    }

    public WebElement Destination() {
        return destination;
    }

    public WebElement Departure() {
        return departure;
    }

    public WebElement Date_of_departure() {
        return date_of_departure;
    }

    public WebElement Passengers_input() {
        return passengers_input;
    }

    public WebElement Input_adults() {
        return input_adults;
    }

    public WebElement Input_teens() {
        return input_teens;
    }

    public WebElement Input_children() {
        return input_children;
    }

    public WebElement Input_infants() {
        return input_infants;
    }

}



