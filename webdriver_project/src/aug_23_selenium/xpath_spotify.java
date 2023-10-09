package aug_23_selenium;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath_spotify {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =  new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://open.spotify.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@data-encore-id='buttonTertiary'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@method='POST']//following::input[1]")).sendKeys("phani1234@gmail.com");
		driver.findElement(By.xpath("//form[@method='POST']//following::input[2]")).sendKeys("phani@1234");
		driver.findElement(By.xpath("//form[@method='POST']//following::input[3]")).sendKeys("phanikrishna");
		driver.findElement(By.xpath("//form[@method='POST']//following::input[4]")).sendKeys("1999");
		new Select(driver.findElement(By.xpath("//form[@method='POST']//following::select[1]"))).selectByIndex(10);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@method='POST']//following::input[5]")).sendKeys("5");
		driver.findElement(By.xpath("//form[@method='POST']//following::span[13]")).click();
		driver.findElement(By.xpath("//form[@method='POST']//following::span[22]")).click();
		driver.findElement(By.xpath("//form[@method='POST']//following::span[26]")).click();
driver.quit();
		

	}

}
