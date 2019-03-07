import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLinkCountsAndText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Define the string variable to get the URL
		String baseURL = "https://www.edureka.co/";
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("The links count is as follows :" +Links.size());
		
      for (int i=0;i<Links.size();i++) {
			String LinkText = Links.get(i).getText();
			System.out.println("the Text in the links are as follows " +LinkText);
		}
		
		driver.close();
	}

}
