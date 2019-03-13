package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Alert


public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String baseURL = "http://demo.guru99.com/test/delete_customer.php";
		//Get the website
		driver.get(baseURL);
		
		//Click on Submit
		driver.findElement(By.xpath("name='submit']")).click();
		
		// Alert alert = driver.switchTo().alert();
		//alert.accept;
		//String text = driver.get

	}

}
