package aug_29_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scroll_to_particular_element_in_webpage {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://jqueryui.com/'");
		Thread.sleep(5000);
		//store menu link into webelement
		WebElement menulink = driver.findElement(By.linkText("Menu"));
		//scroll to menu link
		js.executeScript("document.scrollintoview",menulink);
		menulink.click();
		driver.quit();
	}
}
