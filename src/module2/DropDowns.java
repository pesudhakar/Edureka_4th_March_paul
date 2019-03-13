package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		//Get the website
		driver.get(baseURL);
		
		//Select first value in drp down
		Select drpdwn = new Select(driver.findElement(By.name("country")));
				drpdwn.selectByIndex(1);
				drpdwn.selectByValue("ANGOLA");
				driver.close();
				
		

	}
	
}
