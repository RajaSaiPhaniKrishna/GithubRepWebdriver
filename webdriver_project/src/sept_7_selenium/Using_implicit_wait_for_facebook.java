package sept_7_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_implicit_wait_for_facebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
driver.findElement(By.linkText("Create new account")).click();
driver.findElement(By.name("firstname")).sendKeys("Phani krishna");
}
}
