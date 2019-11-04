import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown_SpiceJet_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// https://www.guru99.com/select-option-dropdown-selenium-webdriver.html

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		s.selectByVisibleText("USD");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		/*
		 * int i=1; - initialisation while(1<5) - comparison {
		 * driver.findElement(By.id("hrefIncAdt")).click();//5 adult i++; - condition }
		 */
		for (int i = 1; i < 3; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		} // 8 adult {}
		for (int b = 0; b < 4; b++) 
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		for (int c = 0; c < 2; c++)
		{
			driver.findElement(By.id("hrefIncInf")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
//    Assert.assertEquals(driver.findElement(By.id("hrefIncAdt")).getText(),"3 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		//

		Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());

		// count all of boxes
		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk']")).getSize()); // regular
																												// expression
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());

//        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        driver.findElement(By.xpath("//a[contains(text(),'Amritsar (ATQ)')]")).click();
//    	driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR']")).click();
//		Thread.sleep(2000L);
//        driver.findElement(By.xpath("//li[contains(@class,'city_selected')]//a[contains(text(),'Goa (GOI)')]")).click();

//		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
//		Assert.assertEquals(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).isEnabled(), true);
//      or		
//		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
//		Assert.assertEquals(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).isEnabled(), true);
//		or
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			;
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}

		{
			Assert.assertTrue(false);
		}
	}
}
//    Thread.sleep(2000);

//    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

//    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Coimbatore (CJB)')]")).sendKeys(Keys.ENTER);

//  //Dinamic Dropdowns
//    
//    driver.findElement(By.xpath("//option[@value='ATQ']")).click();
// //   System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
//    	Thread.sleep(2000L);
//    driver.findElement(By.xpath("//a[contains(text(),'Bagdogra (IXB)')]")).click();
// //   System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
//    
