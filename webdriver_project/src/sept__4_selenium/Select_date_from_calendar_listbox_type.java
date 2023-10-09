package sept__4_selenium;

import java.util.List;

import org.asynchttpclient.webdav.WebDavResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_date_from_calendar_listbox_type {

	public static void main(String[] args) throws Throwable {
		String dob = "6-Sep-1999";
		String temp[] = dob.split("-");
		String Date = temp[0];
		String Month = temp[1];
		String Year = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(2000);
		//click register link
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		//click dob textbox to get calendar
		driver.findElement(By.name("dob")).click();
		Thread.sleep(2000);
		//select year from list box 
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(Year);
		Thread.sleep(2000);
		//select month from listbox
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(Month);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) 
		{
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) 
			{
				if(eachcell.getText().equals(Date))
				{
					Thread.sleep(2000);
					eachcell.click();
					break;
				}
			}

		}
	}
}
