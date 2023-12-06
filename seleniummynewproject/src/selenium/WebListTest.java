package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.com/");

	   //WebElement first = driver.findElement(By.tagName("akmcls"));
	   // WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']")); 
	   //List<WebElement>allLinks = footer.findElements(By.tagName("a"));
	    
	   // option2
	    List<WebElement>alllinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
	   System.out.println(alllinks.size());
	   
	   //allLinks.get(0).click();
	   for(int i=0; i<alllinks.size();i++) {
	   System.out.println(alllinks.get(i).getText());
	   }
	   	   
	}

	}
