package sept__4_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_reservation_in_admin_ {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/user/ranga.html");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("pranga82@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ranga123");
		driver.findElement(By.xpath("(//*[@type='submit'])")).click();
		driver.findElement(By.id("search-date")).click();
		Thread.sleep(5000);
		String dof = "24/December/2026";
		String temp[]= dof.split("/");
		String Date = temp[0];
		String Month = temp[1];
		String Year = temp[2];
		//capture year from calendar
				String calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
				while(!calYear.equals(Year))
				{
					//click next button
					driver.findElement(By.xpath("(//span[text()='Next'])")).click();
					calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
					System.out.println(calYear);
				}
				//capture month from calendar
			String calMonth= driver.findElement(By.className("ui-datepicker-month")).getText();
					while(!calMonth.equalsIgnoreCase(Month))
					{
						//click next button
						Thread.sleep(200);
						driver.findElement(By.xpath("(//span[text()='Next'])")).click();
						calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
						System.out.println(calMonth);
					}
				WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
				List<WebElement>rows,cols;
				rows = webtable.findElements(By.tagName("tr"));
				for (WebElement eachrow : rows) 
							{
					cols = driver.findElements(By.tagName("td"));
					for (WebElement eachcell : cols) 
					{
						if(eachcell.getText().equals(Date))
						{
							Thread.sleep(2000);
							eachcell.click();
							
						}
					}
				}
			}
	}


