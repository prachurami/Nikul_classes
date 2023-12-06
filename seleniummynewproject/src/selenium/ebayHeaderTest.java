package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ebayHeaderTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.ebay.ca/");
	  
	   List<WebElement>alllinks = driver.findElements(By.xpath("//ul[@class='vl-flyout-nav__container']/li/a"));
	   System.out.println(alllinks.size());
	   
	   for(int i=0; i<alllinks.size();i++) {
	   System.out.println(alllinks.get(i).getText());
	}
	}
}