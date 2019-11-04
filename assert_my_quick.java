import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Quick_academy_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
    	driver.findElement(By.cssSelector("#checkBoxOption1")).click();
    	Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
    	System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
    	driver.findElement(By.cssSelector("#checkBoxOption1")).click();
    	Thread.sleep(2000);
    	Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
    	System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
    	System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize()); // regular expression
	}

}
