package sept_9_selenium;

import org.openqa.selenium.By;

public class Child extends Parent {
		public static void Clickbranches ()
		{
			driver.findElement(By.xpath("(//img)[5]")).click();
		}
		public static void main(String[] args) {
			Parent.launchurl("http://primusbank.qedgetech.com/");
		Parent.login("Admin", "Admin");
			Child.Clickbranches();
			}
}
