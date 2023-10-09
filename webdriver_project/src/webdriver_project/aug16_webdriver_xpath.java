package webdriver_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aug16_webdriver_xpath {

	public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://flights.qedgetech.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		//click on register 
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		//fill register form
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("phani");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("9182700078");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajasaiphanikrishna@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("test1234");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("06-11-1999");
		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		

	}

}
