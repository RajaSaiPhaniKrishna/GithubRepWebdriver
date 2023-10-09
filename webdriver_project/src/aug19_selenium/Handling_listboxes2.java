package aug19_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_listboxes2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http:/amazon.in");
		Thread.sleep(5000);
		//store listbox into select class
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in dropdown
		List<WebElement>all_items = dropdown.getOptions();
		System.out.println("No.of items in listbox::::"+all_items.size());
		//iterate all items in list box
		for (WebElement each : all_items) 
		{
			System.out.println(each.getText());
		}
		driver.quit();
		

	}

}
