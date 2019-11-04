import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author gora
 *
 */
public class Alerts_Java_deactivated {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Assignment: UI(Dropdowns,EditBoxes,Error Valdiation) Assignment
	String text="Gora";
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	// for censel or refuse from alert:
			driver.findElement(By.id("name")).sendKeys(text);
			driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
