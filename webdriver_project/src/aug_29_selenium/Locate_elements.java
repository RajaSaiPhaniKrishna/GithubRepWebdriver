package aug_29_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_elements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://demo.opencart.com/'");
		Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='My Account']")).click();
driver.findElement(By.xpath("//a[text()='Register']")).click();
js.executeScript("document.querySelector(\"#input-firstname\").value = 'Phani krishna'");
js.executeScript("document.querySelector('#input-lastname').value = 'Yerramsetti'");
Thread.sleep(2000);
//with jspath
//js.executeScript("document.querySelector(\"#input-email\").value = 'rajasaiphanikrishna@gmail.com'");
//with id
js.executeScript("document.getElementById('input-email').value = 'rajasaiphanikrishna@gmail.com'");
//with jspath
//js.executeScript("document.querySelector(\"#input-password\").value = 'phani@1234'");
//with id
js.executeScript("document.getElementById('input-password').value = 'phani@1234'");
//scroll the window
js.executeScript("window.scrollBy(0,300)");
Thread.sleep(5000);
js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
Thread.sleep(5000);
js.executeScript("document.querySelector(\"button[type='submit']\").click()");
driver.quit();
	}
}
