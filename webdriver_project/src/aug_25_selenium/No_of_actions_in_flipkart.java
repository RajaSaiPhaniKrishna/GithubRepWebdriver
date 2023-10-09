package aug_25_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class No_of_actions_in_flipkart {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flipkart.com");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(5000);
		//move mouse to electronics
		ac.moveToElement(driver.findElement(By.xpath("//img[@alt='Electronics']"))).perform();
		Thread.sleep(5000);
		//move mouse to all & click it
		ac.moveToElement(driver.findElement(By.xpath("(//a[@class='_3490ry'])[1]"))).click().perform();
		Thread.sleep(5000);
		//move mouse to baby & kids
		ac.moveToElement(driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[5]"))).perform();
		Thread.sleep(5000);
		//move mouse to puzzles and click
		ac.moveToElement(driver.findElement(By.xpath("(//a[@class='_3QN6WI'])[37]"))).click().perform();
		Thread.sleep(5000);
		driver.quit();


	}

}
