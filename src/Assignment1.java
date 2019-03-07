import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Define the string variable to get the URL
		String baseURL = "https://www.edureka.co/";
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get(baseURL);
		
		//get the title of the page to verify you are in the right page
		String title = driver.getTitle();
		System.out.println("The title of the Page is " +title);
		
		driver.close();
		

	}

}
