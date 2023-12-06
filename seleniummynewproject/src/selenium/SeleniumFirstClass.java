package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		//classname objname = new classname();
		
		FirefoxDriver driver = new FirefoxDriver();//open firefox//constructor-open firefox-same for safari,chrome
		
		driver.get("https://www.facebook.com/");//open facebook
		
		driver.findElement(By.id("email")).sendKeys("ghfsfdgdbdjnkd");//type wrong email id
		driver.findElement(By.id("pass")).sendKeys("dfghfjhjhv");// type wrong pass
		driver.findElement(By.name("login")).click();// click on login butoon
	  
	
	}

}
