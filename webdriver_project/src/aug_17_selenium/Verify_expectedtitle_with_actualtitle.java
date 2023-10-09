package aug_17_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_expectedtitle_with_actualtitle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		Thread.sleep(5000);
		String expectedtitle = "google";
		String actualtitle = driver.getTitle();
		//verify expected title is equals to actual title
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("title is matching::::"+expectedtitle+ "      "+actualtitle);
		}
		else
		{
			System.out.println("title is not matching::::"+expectedtitle+"    "+actualtitle);
		}
		driver.quit();
	}
}


