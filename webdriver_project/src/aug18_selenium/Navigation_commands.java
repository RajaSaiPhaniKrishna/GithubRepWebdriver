package aug18_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_commands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://google.com");
		System.out.println("Title  -1"+driver.getTitle());
		Thread.sleep(5000);
		//click on gmail link
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		//click back button
		driver.navigate().back();
		System.out.println("Title   -2"+driver.getTitle());
		//click forward button
		driver.navigate().forward();
		System.out.println("Title   -3"+driver.getTitle());
		//click refresh button
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.out.println("Title   -4"+driver.getTitle());
		driver.quit();
	}
}
