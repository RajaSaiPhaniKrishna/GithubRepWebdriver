package sept__4_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_country_found_in_table {

	public static void main(String[] args) throws Throwable {
		String Expected_country = "Canada";
		boolean country_exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.id("customers"));
		List<WebElement>rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No.of rows::::"+ row);
		for (WebElement eachrow : rows) 
		{
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) 
			{
				String Actual_data= eachcell.getText();
				System.out.println("\n"+Actual_data);
				if (Actual_data.equalsIgnoreCase(Expected_country))
				{
					country_exist=true;
					break;

				}
			}
			System.out.println();
			System.out.println("===============");
		}
		if(country_exist)
		{	
			System.out.println(Expected_country+"      "+"country found in table");
		}

		else {
			System.out.println(Expected_country+"      "+"country Not found in table");
		}
		driver.quit();
	}

}
