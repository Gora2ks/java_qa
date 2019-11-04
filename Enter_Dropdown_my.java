import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_Dropdown_ {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			Thread.sleep(5000);
			driver.get("https://wizzair.com/#/");			
			WebElement source=driver.findElement(By.id("search-departure-station"));
				source.click();
					Thread.sleep(3000);
				source.sendKeys("tiran");
					Thread.sleep(2000);
				source.sendKeys(Keys.ENTER);
				driver.findElement(By.id("search-arrival-station")).sendKeys("lond");
				driver.findElement(By.id("search-arrival-station")).sendKeys(Keys.ENTER);
					Thread.sleep(10000);
				driver.findElement(By.xpath("//button[@class='rf-button rf-button--medium rf-button--primary rf-button--shrinkable']")).click();
							Thread.sleep(2000L);
				driver.findElement(By.id("search-passenger")).click();
				Thread.sleep(2000);				
				for(int i=1;i<5;i++)
				{
					driver.findElement(By.xpath("//fieldset[@class='flight-search__panel__fieldset flight-search__panel__fieldset--passengers']//div[3]//button[2]")).click();
				}
				for(int i=0;i<2;i++)
				{
					driver.findElement(By.xpath("//div[4]//button[2]")).click();
				}
				for(int i=0;i<4;i++)
				{
					driver.findElement(By.xpath("//div[5]//button[2]")).click();
				}

		}

	}


