package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.automationtesting.in/FileDownload.html";
		//Get the website
		driver.get(baseURL);
		
		driver.findElement(By.id("textbox")).sendKeys("TestFile");
		driver.findElement(By.id("createTxt")).click();;
		driver.findElement(By.id("link-to-download")).click();

	}

}
