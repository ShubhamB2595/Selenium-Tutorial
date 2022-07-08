package firstScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseURL = "https://demo.guru99.com/";
		String userName = "mngr423660";
		String password = "jAhujug";
		
		driver.get(baseURL);
	}

}
