package aug_24_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_webelement_status_in_facebook_ {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
driver.navigate().to("https://facebook.com");
	driver.findElement(By.xpath("(//*[contains(@id,'u_0')])[6]")).click();
	Thread.sleep(5000);
	//verify first name text box is enable (or)not
	WebElement first_name = driver.findElement(By.xpath("(//*[contains(@id,'u_')])[8]"));
	//WebElement first_name = driver.findElement(By.xpath("//form[@method='post']//following::input[8]"));
	boolean first_is_enabled = first_name.isEnabled();
	System.out.println(first_is_enabled);
	//verify renter email textbox is displayed (or) hidden
	WebElement reentertext_box = driver.findElement(By.xpath("(//input[@name='reg_email_confirmation__'])"));
	//WebElement reentertext_box = driver.findElement(By.xpath("//form[@method='post']//following::input[11]"));
	boolean mail_is_displayed = reentertext_box.isDisplayed();
	System.out.println(mail_is_displayed);
	//verify radio button is true (or) false
	WebElement radio_button = driver.findElement(By.xpath("(//*[@value='2'])[3]"));
	//WebElement radio_button = driver.findElement(By.xpath("//form[@method='post']//following::input[16]"));
	boolean radio_isselected = radio_button.isSelected();
	System.out.println(radio_isselected);
	driver.quit();
	}
	}
