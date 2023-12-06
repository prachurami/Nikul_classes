package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
	

		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.com/");
	    
	    //using Webelement,we can not verify if element is present or not
	    /*if(driver.findElement(By.linkText("about")).isDisplayed()) {
	    	System.out.println("Element Present");
	    }else {
	    	System.out.println("Element Not Present");
	    }*/
	    
	    List<WebElement> element = driver.findElements(By.linkText("Abouthjdhk"));
	    System.out.println(element.size());
	    
	    if (element.size()>0) {
	    	System.out.println("Element Present");
	    }else {
        System.out.println("Element Not Present");
	}

}
}