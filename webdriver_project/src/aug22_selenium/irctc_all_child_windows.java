package aug22_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class irctc_all_child_windows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlefour']")).click();
		Set<String>all_trains = driver.getWindowHandles();
		System.out.println(all_trains);
		for (String each : all_trains) 
		{
			if (!Parent.equals(each))
			{
				Thread.sleep(2000);
				String page_title = driver.switchTo().window(each).getTitle();
				System.out.println(page_title);
				Thread.sleep(2000);
				driver.close();
				}
			}
	Thread.sleep(5000);
	driver.switchTo().window(Parent);
	driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']//input[@type='text']")).sendKeys("vijayawada");
	Thread.sleep(2000);
	driver.quit();
	
	}

}
