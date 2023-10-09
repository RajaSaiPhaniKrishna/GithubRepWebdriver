package aug_17_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Capture_gmail_by_using_gettext_getattribute {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.get("https://google.com");
		//capture Gmail text		
		String visibletext = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(visibletext);
		//capture gmail link url 
		String gmaillink = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(gmaillink);
		driver.quit();
	}
}
