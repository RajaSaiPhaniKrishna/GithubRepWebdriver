package aug_25_selenium;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class arrow_up_in_gmail_operation {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://gmail.com");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac = new Actions(driver);
		//click create link
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]")).click();
		Thread.sleep(5000);
		//press up arrow  for three times
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		//click enter key
		ac.sendKeys(Keys.ENTER).perform();
		driver.quit();
	}
}
