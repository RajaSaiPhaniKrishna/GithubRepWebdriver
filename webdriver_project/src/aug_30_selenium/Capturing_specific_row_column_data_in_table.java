package aug_30_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_specific_row_column_data_in_table {

	public static void main(String[] args) throws Throwable  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://money.rediff.com/mutual-funds");
	Thread.sleep(5000);
	//capture specific row cell data in a table
	String tabletext1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[1]")).getText();
	String tabletext2 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[8]/td[2]")).getText();
	System.out.println(tabletext1+"       "+tabletext2);
	driver.quit();
	}
}
