package aug18_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection_of_hyperlinks {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://redbus.com");
		Thread.sleep(5000);
		//get collection of links which are stored into html tag "a"
		List<WebElement>alllinks = driver.findElements(By.tagName("a"));
		System.out.println("No of links are :::"+alllinks.size());
		//print each link text
		for (WebElement each : alllinks) {
			System.out.println(each.getText());
			//print each link url
			System.out.println(each.getAttribute("href"));
		}
		driver.quit();
	}
}
