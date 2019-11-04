import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Disable_Enable_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("http://spicejet.com");
		
	
//		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
//		Assert.assertEquals(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).isEnabled(), true);
//		System.out.println(driver.findElement(By.name("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
		
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
	}

}
