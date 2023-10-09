package aug_17_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url_is_secured_or_not {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		String expected = "https://";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
		System.out.println("url is secured::::"+expected+"     "+actual);
}
		else
		{
System.out.println("url is unsecured::::"+expected+"     "+actual);
		}
}
}