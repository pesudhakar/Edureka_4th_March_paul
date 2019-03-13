package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http:\\seleniumautomationpractice.blogspot.com/2018/01/blog-post.html";
		//Get the website
		driver.get(baseURL);
		
		//click on alert
		driver.findElement(By.id("alert")).click();
		
			Alert al = driver.switchTo().alert();
			al.getText();
			System.out.println("the text is "+al.getText());
			al.accept();
	}

}
