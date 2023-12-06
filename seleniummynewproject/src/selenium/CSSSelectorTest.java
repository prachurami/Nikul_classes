package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSSelectorTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    
	    driver.findElement(By.cssSelector("#email")).sendKeys("abdc");
	    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("husdfngjf");
	    driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
	    


	}

}
