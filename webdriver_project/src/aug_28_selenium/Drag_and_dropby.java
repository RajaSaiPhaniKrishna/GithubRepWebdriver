package aug_28_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_dropby {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		Thread.sleep(5000);
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		//creating x coordinates
		int x = target.getLocation().getX();
		Thread.sleep(5000);
		//creating y coordinates
		int y = target.getLocation().getY();
		System.out.println(x+"     "+y);
		//take drag and drop by webelement
		ac.dragAndDropBy(source, x, y);
		driver.quit();
	}
}
