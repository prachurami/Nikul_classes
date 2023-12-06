package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonlisttest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.amazon.com/");
	  
	   List<WebElement>alllinks = driver.findElements(By.xpath("//div[@id='nav-main']//a"));
	   System.out.println(alllinks.size());
	   
	   for(int i=0; i<alllinks.size();i++) {
	   System.out.println(alllinks.get(i).getText());
	}

	}

}
