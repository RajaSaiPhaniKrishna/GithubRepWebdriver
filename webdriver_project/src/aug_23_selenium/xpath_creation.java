package aug_23_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath_creation {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://facebook.com");
	Thread.sleep(10000);
	//click create new account
	driver.findElement(By.xpath("//*[starts-with(@id,'u_0_0')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//form[@id='reg']//following::input[2]")).sendKeys("Testing");
	driver.findElement(By.xpath("//form[@id='reg']//following::input[3]")).sendKeys("selenium");
	driver.findElement(By.xpath("//form[@id='reg']//following::input[4]")).sendKeys("9phanikrishna@gmail.com");
	driver.findElement(By.xpath("//form[@id='reg']//following::input[5]")).sendKeys("9phanikrishna@gmail.com");
driver.findElement(By.xpath("//form[@id='reg']//following::input[6]")).sendKeys("phani1234");
new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[1]"))).selectByIndex(5);
new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[2]"))).selectByIndex(10);
new Select(driver.findElement(By.xpath("/form[@id='reg']//following::select[3]"))).selectByVisibleText("1999");
driver.findElement(By.xpath("//form[@id='reg']//following::input[10]")).click();
driver.findElement(By.xpath("//form[@id='reg']//following::a[5]")).click();
driver.quit();
}
}
