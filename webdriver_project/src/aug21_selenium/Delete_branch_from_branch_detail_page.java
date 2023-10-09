package aug21_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_branch_from_branch_detail_page {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		//login using valid username & password and click on login 
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//click on branches button 
		driver.findElement(By.xpath("(//img)[5]")).click();
		//click on  first row delete symbol
		driver.findElement(By.xpath("(//img)[11]")).click();
		// capture alert message
		String alert_message = driver.switchTo().alert().getText();
		//print alert message
		System.out.println(alert_message);
		Thread.sleep(5000);
		//click on cancel button 
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		//click on first row delete symbol
		driver.findElement(By.xpath("(//img)[11]")).click();
		//capture alert message
		String alert_message1 = driver.switchTo().alert().getText();
		System.out.println(alert_message1);
		Thread.sleep(2000);
		//click on ok button
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//capture alert message
		String alert_message3 = driver.switchTo().alert().getText();
		System.out.println(alert_message3);
		Thread.sleep(2000);
		//click on ok button 
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
