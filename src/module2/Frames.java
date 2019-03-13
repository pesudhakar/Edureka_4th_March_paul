package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String baseURL = "http://demo.automationtesting.in/Frames.html";
		//Get the website
		driver.get(baseURL);
		
		//using frame index
		//driver.switchTo().frame(0);
		
		//using frame name
		//driver.switchTo().frame("//iframe[@id='singleframe']");
		
		//entering data using property of webelement
		//WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']")).sendKeys("test");
		
		//Entering data in the text box of the frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Paul");
		
		//iframe[@id='singleframe']
	}

}
