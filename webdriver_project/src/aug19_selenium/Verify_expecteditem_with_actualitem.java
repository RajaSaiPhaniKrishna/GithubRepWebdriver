package aug19_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_expecteditem_with_actualitem {

	public static void main(String[] args) throws Throwable {
		//String expecteditems = "books";
		String expecteditems = "Hyderabad";
		boolean item_exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http:/amazon.in");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>all_items = dropdown.getOptions();
		System.out.println("No.of items in listbox items::::"+all_items.size());
		Thread.sleep(1000);
		for (WebElement each : all_items) 
		{
		Thread.sleep(1000);
		String actual_items = each.getText();
		System.out.println(actual_items);
		if (actual_items.equalsIgnoreCase(expecteditems))
		{
			item_exist = true;
			break;
		}
		}
if(item_exist)
{
	//if item exist is true
	System.out.println("expecteditems::::"+"item found in listbox");
	
}
else
{
	//if item exist is not true
	System.out.println("expecteditems::::"+"item not found in listbox");
}
driver.quit();
	}

}
