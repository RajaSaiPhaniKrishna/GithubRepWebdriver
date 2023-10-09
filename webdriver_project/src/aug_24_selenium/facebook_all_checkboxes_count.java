package aug_24_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_all_checkboxes_count {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		//click create new account 
		driver.findElement(By.xpath("(//*[contains(@id,'u_0')])[6]")).click();
		Thread.sleep(5000);
		//get collection of radio buttons
	List<WebElement>radio_buttons = driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
		System.out.println("No.of radio buttons are::"+radio_buttons.size());
for (WebElement each : radio_buttons)
{
	System.out.println(each.getText());
}
driver.quit();
	}
}
