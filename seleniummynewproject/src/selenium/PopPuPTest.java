package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopPuPTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.aliexpress.com/");
	
	    //if popup--> close popup-->Type computer in serch box
	    //if no popup-->TYpe computer in serch box
	    // Assume out of 10 times WebElementting popup 5 times.
	    
	    List<WebElement> popup = driver.findElements(By.className("_24EHh"));
	    System.out.println(popup.size());
	    
	    if(popup.size()>0) {
	    	popup.get(0).click();
	    }
	    	 driver.findElement(By.id("search-key")).sendKeys("computer"); 
	}
}

