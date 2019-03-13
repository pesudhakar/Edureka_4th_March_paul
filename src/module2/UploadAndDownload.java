package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/upload/";
		//Get the website
		driver.get(baseURL);
		
		//uploading a file
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));

		Thread.sleep(2000);
		uploadFile.sendKeys("C:\\Selenium_Upload.txt");
		//Slect I agree the terms
		driver.findElement(By.id("terms")).click();
		//Click on Upload
		driver.findElement(By.name("send"));

	}
}
