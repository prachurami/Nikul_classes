package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
	
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://ca.yahoo.com/");
	  
	   List<WebElement>alllinks = driver.findElements(By.xpath("//div[@class='bd']//a"));
	   System.out.println(alllinks.size());
	   
	   for(int i=0; i<alllinks.size();i++) {
	   System.out.println(alllinks.get(i).getText());
	}
	}
}

