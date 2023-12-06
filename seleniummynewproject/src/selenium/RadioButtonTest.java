package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://echoecho.com/htmlforms10.htm");
	    Thread.sleep(60000);
	    
	    List<WebElement>allRadio = driver.findElements(By.name("group1"));
	    System.out.println(allRadio.size());
	    
	    for(int i=0; i<allRadio.size(); i++) {
	    	if(allRadio.get(i).isSelected()) {
	    	System.out.println(allRadio.get(i).getAttribute("value")+"--------"+allRadio.get(i).isSelected());
	    }
	    }
	   driver.findElement(By.xpath("//input[@value='Cheese']")).click();
	   // allRadio.get(2).click();
	    System.out.println("--------------------------");
	    
	    for(int i=0; i<allRadio.size(); i++) {
	     	if(allRadio.get(i).isSelected()) {
	    	System.out.println(allRadio.get(i).getAttribute("value")+"--------"+allRadio.get(i).isSelected());
	    }
	}
	}
}
