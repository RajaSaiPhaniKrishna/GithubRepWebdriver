package aug19_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.primitives.Booleans;

public class Handling_listboxes1{

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http:/facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		//store three listbox into select class
		Select daylistbox = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlistbox = new Select(driver.findElement(By.name("birthday_month")));
		Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
		boolean value = monthlistbox.isMultiple();
		System.out.println(value);
		//select items in above list box
		daylistbox.selectByVisibleText("6");
		Thread.sleep(2000);
		monthlistbox.selectByIndex(10);
		Thread.sleep(2000);
		yearlistbox.selectByVisibleText("1999");
		Thread.sleep(2000);
		//selecting another items in list box
		daylistbox.selectByIndex(14);
		Thread.sleep(2000);
		System.out.println(daylistbox.getFirstSelectedOption().getText());
		monthlistbox.selectByVisibleText("Sep");
		Thread.sleep(2000);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		yearlistbox.selectByVisibleText("1986");
		Thread.sleep(2000);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		driver.quit();
	}
}
