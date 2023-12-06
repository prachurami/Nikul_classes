package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
 	    
	    //Email
	    //1.ClassName - Not Working
	    //driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("jhfy");//can not use classname with sapce
  
	    //2.cssSelector - yet to lern syntax for cssSelector
	  // driver.findElements(By.cssSelector(null)).sendkeys("dhufhd");
	    
	    //3.id - id attribute and working
	    driver.findElement(By.id("email")).sendKeys("abdc");
	    
	    //4.linktext - only for links,can not use it here
	   // driver.findElements(By.linkText(null))
	    
	    //5.name - working
	   driver.findElement(By.name("email")).sendKeys("hdhkuf");
	    
	    //6. partialLinktext - only for links
	    //driver.findElement(By.partialLinkText(null))
	    
	    //7. tag name - not unique
	   // driver.findElement(By.tagName("input")).sendKeys("sjid");
	    
	    //8. xpath-yet to lern syntax for xpath
	    driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"] ")).sendKeys("jdhfu");
	    
	   //Password
	    driver.findElement(By.name("pass")).sendKeys("husd");
	    
	    // LoginButton
	    driver.findElement(By.tagName("button")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
