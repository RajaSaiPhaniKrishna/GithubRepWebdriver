package aug_24_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_collection_of_radio_buttons {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("pranga82@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ranga123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		//get collection of radio buttons
		List<WebElement>radio_buttons = driver.findElements(By.xpath("//div[@class='radio_b']"));
		System.out.println("No.of radio buttons are::"+radio_buttons.size());
		for (WebElement each : radio_buttons) 
		{
			System.out.println(each.getText());
			}
driver.quit();
	}
}
