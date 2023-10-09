package sept_7_selenium;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		//create java time stamp
java.util.Date date = new java.util.Date();
		DateFormat df = new SimpleDateFormat("yyyy_mm_dd    hh_mm_ss");
		String datef = df.format(date);
		//take screenshot and store into one variable
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//copy screen shot into local system
		FileUtils.copyFile(screen, new File("D:/Screenshot/"+datef+"______"+"homepage.png"));
		driver.quit();
		
	

	}

}
