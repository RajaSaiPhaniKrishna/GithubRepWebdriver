package aug22_selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_specific_window_amongall_classes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(5000);
		//store all windows in array list
		ArrayList<String>phani = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(phani);
		//switch to privacy & terms 
		driver.switchTo().window(phani.get(2));
		Thread.sleep(2000);
		//click link
		driver.findElement(By.linkText("Technologies")).click();
		Thread.sleep(2000);
		driver.close();
		//switch to terms & service
		driver.switchTo().window(phani.get(3));
		Thread.sleep(2000);
		//click link
		driver.findElement(By.linkText("Community")).click();
		Thread.sleep(2000);
		driver.close();
		//switch to help window
		driver.switchTo().window(phani.get(1));
		//click link
		driver.findElement(By.linkText("Technologies")).click();
		Thread.sleep(2000);
		driver.close();
		//switch to parent window
		driver.switchTo().window(phani.get(0));
		//click link
		driver.findElement(By.linkText("Learn more")).click();
		Thread.sleep(2000);
	driver.quit();




	}

}
