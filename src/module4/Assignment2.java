package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.edureka.co/";
		//Get the website
		driver.get(baseURL);
		
		//PageLoad - it will allow the page to load till the specified time before throwing error
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Maximize the page
		driver.manage().window().maximize();
		
		//Implicit Wait - it will wait for the specified time before throwing error
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		//asynchronous script timeout
		driver.manage().timeouts().setScriptTimeout(1,TimeUnit.SECONDS);
		
		//search for selenium course in the search box
		driver.findElement(By.xpath("//input[@id='search-inp']")).sendKeys("Selenium Certification Training");
		driver.findElement(By.xpath("//input[@id='search-inp']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='search-inp']")).sendKeys(Keys.ENTER);
		//Click on search after entering the search input
		//driver.findElement(By.xpath("//span[@class='typeahead__button']")).click();
		//Click Enter
		//driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);
		
		//Explicit wait - the webDriver instance waits before locating webElements or performing actions on them and then clicks on the result
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='textinfoleft']"))).click();
		
		String AppTitle = driver.getTitle();
		
		boolean result = AppTitle.equals("Selenium Training | Selenium Certification Course- Edureka");
		System.out.println(result);
		
		//Navigate back to the prev page
		driver.navigate().back();
		driver.navigate().back();
		
		//wait for the page to load 
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='search-inp']")));
		
		//Now click on All Courses
		driver.findElement(By.xpath("//div[@class='slick-list draggable']//div[@class='slick-track']//li[1]/a")).click();
		
	
		//Close the browser
		driver.close();
		
		}
		
		
	}


