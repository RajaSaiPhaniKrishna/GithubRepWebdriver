package sept_6_selenium;
import java.io.*;
import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_login_functionality_with_multiple_set_of_data {

	public static void main(String[] args)throws Throwable{
	 //read path of file
		FileReader fr = new FileReader("D:/orange hrm notepad.txt");
		BufferedReader br = new BufferedReader(fr);
		String Str = "   ";
		while ((Str = br.readLine())!= null)
		{
		//split notepad data into array 
			String login[]= Str.split(";");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			Thread.sleep(5000);
			driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(4000);
			String Expected = "dashboard";
			String Actual = driver.getCurrentUrl();
			if(Actual.contains(Expected))
			{
				System.out.println("Login is Successful::::"+Expected+"        "+Actual);
			}
			else
			{
				//capture error message
				String error_message = driver.findElement(By.id("spanMessage")).getText();
				System.out.println(error_message+"      "+Expected+"     "+Actual);
				}
		driver.quit();
		}
}
}
