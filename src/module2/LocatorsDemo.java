package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Define the string variable to get the URL
		String baseURL = "https://www.facebook.co/";
		//Maximize the window
		driver.manage().window().maximize();
		//Get the URL
		driver.get(baseURL);
		
		
	}

}
