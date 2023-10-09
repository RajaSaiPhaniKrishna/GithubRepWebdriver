package aug_24_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_no_of_checkboxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/Lenovo/Downloads/checkbox_1_lyst1698.html");
		Thread.sleep(5000);
		//get collection of check boxes
List<WebElement>all_checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
System.out.println("No.of check boxes are::"+all_checkboxes.size());
//iterate all check boxes
for (WebElement each : all_checkboxes)
{
//verify each check box is true or false
	boolean value = each.isSelected();
	//capture each check box name
String  checkbox_name = each.getAttribute("value");
System.out.println(checkbox_name+"    "+value);
//check checkbox which are not selected uncheck which are selected
Thread.sleep(5000);
each.click();
}
Thread.sleep(5000);
driver.quit();
	}
}
