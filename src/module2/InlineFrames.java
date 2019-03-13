package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InlineFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String baseURL = "http://demo.automationtesting.in/Frames.html";
		//Get the website
		driver.get(baseURL);
		
		//Click on Inline frame
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		//Switch to frme 1
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		//using frame index switch to first
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(0);
		//using frame name
		//driver.switchTo().frame("//iframe[@id='singleframe']");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Paul");
	}

}
