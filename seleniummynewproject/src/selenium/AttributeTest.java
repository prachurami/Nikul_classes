package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.ebay.ca/");
	    
	    //String s = //write selenium code which read search for anything
	    	String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
	    	System.out.println(s);//search for anything
	    	
	    	driver.findElement(By.id("gh-ac")).sendKeys("iphone");
	    	//wants to reday what you type in any input box
	    String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
	    System.out.println(p);//search for anything
	    	
	}

}
