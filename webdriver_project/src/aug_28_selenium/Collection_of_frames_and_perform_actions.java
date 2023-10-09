package aug_28_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Collection_of_frames_and_perform_actions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//get collection of frames in webpages
		List<WebElement> all_frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No.of frames are ::"+all_frames.size());
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		Thread.sleep(5000);
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		ac.clickAndHold(source).moveToElement(target).release().perform();
		//switch to main html page
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		driver.quit();



	}

}
