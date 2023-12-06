package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.com/");
        
	    //driver.findElement(By.linkText("About")).click();
	    driver.findElement(By.partialLinkText("Abo")).click();
	    
	    Thread.sleep(3000);
	    
	    String expectedtitle = "Google - About Google, Our Culture &amp; Company News";
	    String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    
	   // String expectedtitle =
	    

	    if(expectedtitle.equals(actualTitle)) {
	    	System.out.println("Test Pass");
	    }else {
	    	System.out.println("Test Fail");
	    }
	}

}
