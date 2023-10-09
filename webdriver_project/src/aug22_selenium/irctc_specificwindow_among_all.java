package aug22_selenium;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class irctc_specificwindow_among_all {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		//click on links in irctc homepage
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlefour']")).click();
		//store all windows in array list
		ArrayList<String> raja = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(raja);
		//switch to rail dristi window
		driver.switchTo().window(raja.get(2));
		Thread.sleep(2000);
		//click link
		driver.findElement(By.xpath("//i[@class='fas fa-sitemap sitemap']")).click();
		Thread.sleep(2000);
		driver.close();
		//switch to E-catering window
		driver.switchTo().window(raja.get(1));
		//click link
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(2000);
		driver.close();
		//switch to hotels window
		driver.switchTo().window(raja.get(3));
		Thread.sleep(2000);
		//enter value
		driver.findElement(By.xpath("//input[@id='filterText']")).sendKeys("vijayawada");
		Thread.sleep(2000);
		driver.close();
		//switch to flights window
		driver.switchTo().window(raja.get(4));
		Thread.sleep(2000);
		//click link
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
