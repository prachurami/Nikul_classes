package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionList {

public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.ebay.ca/");
	  
	    driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		Thread.sleep(2000);
		
		List<WebElement>all = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	    System.out.println(all.size());
		
		for(int i=0; i<all.size();i++) {
			System.out.println(all.get(i).getText());
		}
} 
}
