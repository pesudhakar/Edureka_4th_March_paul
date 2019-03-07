package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//single line comments
		/*
		 * Multi line comments
		 */
// Basic Commands of Selenium WD
		
		//Open Browser/Initialize/Instantiate Browser
		
		
		//Close and Quit commands
		driver.close();//closes current active window in the current session
		driver.quit();//closes all open windows in current session
		
		//Get commands
		driver.get("URL");//opens URL address
		driver.getCurrentUrl();//verify if you are in the right page(current page)
		driver.getTitle();//captures current page title
		driver.getWindowHandle();//while switching between windows
		
		
		//Navigation commands
		driver.navigate().to("String/URL");//will be used to navigate to an object or an url
		driver.navigate().back();//goes back to prev page
		driver.navigate().forward();//move to next page already executed
		driver.navigate().refresh();//refresh browser
		
		//Element handling
		driver.findElement(By.id(""));
		driver.findElement(By.id("")).clear();
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).sendKeys("");
	}

}
