package webdriver_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aug12_selenium {

	public static void main(String[] args) throws Throwable {
		// create instance object for browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//delete all cookies in browser
		driver.manage().deleteAllCookies();
		//launch url in browser
		driver.get("http://www.flipkart.com");
		//suspend tool from execution for 10 seconds
		Thread.sleep(1000);
		driver.close();
		}
	}
