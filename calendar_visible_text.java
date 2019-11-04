package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spicejet.com");
        driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		Select s = new Select(driver.findElement(By.id("id='divpaxinfo")));
        driver.findElement(By.id("divpaxinfo")).click();
//        driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        Thread.sleep(3000L);
        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        Select n = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        Select m = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
        s.selectByValue("5");
		n.selectByVisibleText("2");
		m.selectByVisibleText("1");
		// it is for enather type of value
//		for(int i=1;i<5;i++)
//		{
//			driver.findElement(By.xpath("//fieldset[@class='flight-search__panel__fieldset flight-search__panel__fieldset--passengers']//div[3]//button[2]")).click();
//		}
//		for(int i=0;i<2;i++)
//		{
//			driver.findElement(By.xpath("//div[4]//button[2]")).click();
//		}
//		for(int i=0;i<4;i++)
//		{
//			driver.findElement(By.xpath("//div[5]//button[2]")).click();
//		}
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();
        driver.findElement(By.xpath("//li[contains(@class,'city_selected')]//a[contains(text(),'Belagavi (IXG)')]")).click();
//        driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
        //.ui-state-default.ui-state-highlight

//
        driver.findElement(By.id("btnclosepaxoption")).click();


    }
}
