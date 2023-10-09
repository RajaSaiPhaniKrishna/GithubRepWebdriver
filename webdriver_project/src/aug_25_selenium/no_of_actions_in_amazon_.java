package aug_25_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class no_of_actions_in_amazon_ {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://amazon.com");
	Thread.sleep(5000);
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"))).click().perform();
	Thread.sleep(5000);
	ac.moveToElement(driver.findElement(By.xpath("//a[@data-menu-id='7']"))).click().perform();
	Thread.sleep(5000);
	driver.quit();
}
}