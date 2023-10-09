package aug_17_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_login_functionality_using_webelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(5000);
		//store username 
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.clear();
		username.sendKeys("dmin");
		//capture username into one variable
		String objuser = username.getAttribute("value");
		//store password
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		//capture password into one variable
		String objpass = password.getAttribute("value");
		//print username and password
		System.out.println("username::::"+"     "+"password");
		//click login button
		driver.findElement(By.name("Submit")).submit();
		Thread.sleep(5000);
		String Expected = "dashboard";
		String actual = driver.getCurrentUrl();
		if( actual.contains(Expected))
		{
			System.out.println("login successful:::"+Expected+"   "+actual);
		}
		else
		{
			//capture Error message
			String errormessage = driver.findElement(By.id("spanMessage")).getText();
			System.out.println("login unsuccessful:::::"+Expected+"      "+actual);
		}
		driver.quit();
	}
}