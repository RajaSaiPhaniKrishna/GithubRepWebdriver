package aug_28_selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick_method_using_robot_method {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//move mouse to gmail link and right click
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(5000);
		//create object for robot class
		Robot r = new Robot();
		//press down arrow key in keyboard
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		//click enter key in keyboard
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//store all windows into array list class
		ArrayList<String>brw = new ArrayList<String>(driver.getWindowHandles());
		// switch to child window gmail
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("(//span[starts-with(text(),'Create an account')])[1]"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		//switch to parent window google and click images
		driver.switchTo().window(brw.get(0));
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
