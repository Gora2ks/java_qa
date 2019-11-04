package test;

import java.awt.List;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit_Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		int j= 0;	
String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"}; 		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		List<WebElement> products=driver.findElement(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();>i++);

	}
}
