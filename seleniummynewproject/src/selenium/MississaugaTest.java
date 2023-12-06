package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.mississauga.ca/");

	    driver.findElement(By.xpath("//ul[@class='main-nav-links']//li[3]/button")).click();
	    Thread.sleep(2000);
	    
	    List<WebElement> all = driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//li"));
	    System.out.println(all.size());
	    
	   for(WebElement a : all) {
		   System.out.println(a.getText());
	   }
	   }
	                                   
	}

