package aug21_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verify_listbox_multi_or_single_item_selection {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/Lenovo/Downloads/MultiListboxHtmlpage_lyst3659.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//verify listbox single (or) multi selection
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		//select 0 to 8 items in list box
		for (int i=0;i<=8;i++)
		{
			Thread.sleep(5000);
			dropdown.selectByIndex(i);
		}
		//deselect from selection 
		dropdown.deselectByIndex(5);
		Thread.sleep(5000);
		dropdown.deselectByVisibleText("Blue");
		Thread.sleep(5000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		driver.quit();
	}
}
