package aug_29_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_login_with_orange_hrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location = 'http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login'");
		Thread.sleep(5000);
		//valid username
		js.executeScript("document.querySelector(\"#txtUsername\").value = 'Admin'");
		//Invalid username
		js.executeScript("document.querySelector(\"#txtUsername\").value = 'Admin123'");
		js.executeScript("document.querySelector(\"#txtPassword\").value = 'Qedge123!@#'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(5000);
		String Expected = "dashboard";
		String Actual = js.executeScript("return document.URL").toString();
		if (Actual.contains(Expected))
		{
			System.out.println("login successful::"+Expected+"     "+Actual);
		}
		else
		{
			//Capture error_message
			String Error_message = js.executeScript("return document.getElementById('spanMessage').innerHTML").toString();
			System.out.println(Error_message+"       "+Expected+"     "+Actual);
		}

	}

}
