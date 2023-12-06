package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BestBuyTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.bestbuy.ca/en-ca");
	    
	    driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
	    Thread.sleep(2000);
	    
	    List<WebElement> all = driver.findElements(By.xpath("(//div[@data-automation='menu-main-l1'])[1]/a"));
	    System.out.println(all.size());
	    
	   for(WebElement a : all) {
		   System.out.println(a.getText());
	   }
	}                                
	}

	

