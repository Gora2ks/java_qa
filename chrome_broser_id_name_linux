package java_s;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_browser {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
		        System.setProperty("webdriver.chrome.driver", "/home/ute/Documents/Work/Develop/Python/webdriver_my/chromedriver");
				WebDriver driver=new ChromeDriver();
				driver.get("https://login.salesforce.com");
//				driver.findElement(By.id("username")).sendKeys("728518196");
//			    driver.findElement(By.name("pw")).sendKeys("kosiv78600");
////				driver.findElement(By.linkText("Забули назву облікового запису?")).click();
////				driver.findElement(By.id("u_0_2")).click(); // error
//				  driver.findElement(By.xpath("//*[@id='Login']")).click();
		    driver.findElement(By.cssSelector("#username")).sendKeys("kosiv");
				driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("gogodz");
				driver.findElement(By.xpath("//*[@id='Login']")).click();
				System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
				driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
				System.out.println(driver.findElement(By.cssSelector("#header")).getText());
				System.out.println(driver.findElement(By.xpath("//*[@id='content']/p")).getText());

			}	
		}


