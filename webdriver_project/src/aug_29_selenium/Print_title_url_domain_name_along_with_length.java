package aug_29_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_title_url_domain_name_along_with_length {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//create object for javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://tatacliq.com'");
		Thread.sleep(5000);
		//print title and length of title
		String Page_title = js.executeScript("return document.title").toString();
		System.out.println(Page_title);
		System.out.println(Page_title.length());
		//print url and length of url
		String strUrl = js.executeScript("return document.URL").toString();
		System.out.println(strUrl);
		System.out.println(strUrl.length());
		//print domain and length of domain
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);
		System.out.println(domain.length());
		driver.quit();
	}
	}
