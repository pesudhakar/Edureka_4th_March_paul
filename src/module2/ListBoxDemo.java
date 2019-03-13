package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBoxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
		//Get the website
		driver.get(baseURL);
		
		
		//switch to the frame where the list box is
		driver.switchTo().frame("iframeResult");
		
		//Locate the listbox
		WebElement ele = driver.findElement(By.name("cars"));
		
		Select sel = new Select(ele);
		sel.selectByIndex(0);
		sel.selectByValue("saab");
		sel.selectByVisibleText("Audi");
		sel.selectByIndex(2);
		
		List<WebElement> all = sel.getAllSelectedOptions();
		for (WebElement webElement:all)
			System.out.println("The list of cars are :"+webElement.getText());
		
		//System.out.println(sel.getOptions());
		
		

	}

}
