package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	  //div[@id='pageFooterChildren']//li
	    List<WebElement>alllinks = driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList ')]/li"));
	   System.out.println(alllinks.size());
	   
	   for(int i=0; i<alllinks.size();i++) {
	   System.out.println(alllinks.get(i).getText());
	}
	}
}

