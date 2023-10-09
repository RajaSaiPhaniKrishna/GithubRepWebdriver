package aug_30_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PIM_collection_in_orange_hrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('txtUsername').value = 'ADMIN'");
		js.executeScript("document.getElementById('txtPassword').value = 'Qedge123!@#'");
		js.executeScript("document.getElementById('btnLogin').click();");
		Thread.sleep(5000);
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click();");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1200)");
		WebElement webtable = driver.findElement(By.xpath("//table[@class='table hover']"));
		List<WebElement>rows,cols;
		//get row collection from table 
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No.of rows are::::"+row);
		Thread.sleep(5000);
		//iterate all rows
		for (WebElement eachrow : rows) 
		{
			//get each row cell collection
			cols =eachrow.findElements(By.tagName("td"));
			//iterate all cells
			for (WebElement eachcell : cols)
			{
				Thread.sleep(500);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
				Thread.sleep(5000);
				System.out.println("\n"+eachcell.getText());
		System.out.println();
		System.out.println("==================================");
			}
		}
		driver.quit();
		}
	}

