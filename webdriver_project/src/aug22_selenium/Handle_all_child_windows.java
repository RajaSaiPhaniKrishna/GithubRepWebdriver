package aug22_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_all_child_windows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://gmail.com");
		Thread.sleep(5000);
		//print parent window id
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		//click on links like help,privacy,terms
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all window Id's
		Set<String>all_wins = driver.getWindowHandles();
		System.out.println(all_wins);
		//iterate all windows
		for (String each : all_wins) 
		{
			//parent id should not be equal to child id
			if (!Parent.equals(each))
			{
				//switch to each child window get title & close
				Thread.sleep(5000);
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
			}}
			driver.switchTo().window(Parent);
			driver.findElement(By.id("identifierId")).sendKeys("rajasaiphanikrishna@gmail.com");
			Thread.sleep(5000);
			driver.quit();
		



	}

}
