package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverTest {

	public static void main(String[] args) {
		
			
			ChromeDriver driver = new ChromeDriver();
	
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("ghfsfdgdbdjnkd");
			driver.findElement(By.id("pass")).sendKeys("dfghfjhjhv");
			driver.findElement(By.name("login")).click();

	}

}
