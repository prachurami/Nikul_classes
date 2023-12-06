package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClassTest {

	public static <Action> void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.ebay.ca/");
       
	    WebElement electronics = driver.findElement(By.linkText("Electronics"));
	    Actions builder = new Actions(driver);
	    builder.moveToElement(electronics).build().perform();
	    Thread.sleep(2000);
	    
	    List<WebElement> all = driver.findElements(By.xpath("//nav[@aria-label='Top Categories']/ul)[5]"));
	    System.out.println(all.size());
	   
	   for(int i=0;i<all.size();i++) {
		   System.out.println(all.get(i).getText());
	   }
	                                             
		
	        
	}

}
