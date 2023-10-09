package aug_25_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class arrow_down_in_googlespace {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//create object for actions
		Actions ac = new Actions(driver);
		driver.findElement(By.xpath("//form[@role = 'search']//following::textarea[1]")).sendKeys("selenium openings");
		Thread.sleep(5000);
		//press down arrow for 3 times
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		//click on enter key
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
