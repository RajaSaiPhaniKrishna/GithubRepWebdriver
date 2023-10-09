package webdriver_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_verification_with_expected_actual {

	public static void main(String[] args) throws Throwable {
		// String expected_year = "1976";
		String expected_year = "1102";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
		List<WebElement> years = yearlistbox.getOptions();
		System.out.println("No.of years are::::" + years.size());
		Thread.sleep(5000);
		boolean year_exist = false;
		for (WebElement each : years) {
			String actual_years = each.getText();
			System.out.println(actual_years);
			if (actual_years.contains(expected_year))
				
			{
				year_exist = true;
				break;
			}
		}
		if (year_exist)
		{
			System.out.println(expected_year + "     " + "year found in listbox");

		} else {

			System.out.println(expected_year + "     " + "year notfound in listbox");
		}
	}
}