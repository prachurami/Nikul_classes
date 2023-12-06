package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
	//parentclass(interface)objname = new classname();
	   //FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();
		
		 
		driver.get("https://www.facebook.com/");//open facebook
		
		driver.findElement(By.id("email")).sendKeys("ghfsfdgdbdjnkd");//type wrong email id
		driver.findElement(By.id("pass")).sendKeys("dfghfjhjhv");// type wrong pass
		driver.findElement(By.name("login")).click();// click on login butoon
	   


	}

}
