import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
        FirefoxDriver driver = new FirefoxDriver();	
	    driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-GB&ifkv=AXo7B7WY1t-iKoSog7o8Qgx8LtxFWanc7NFyX8MItMi1dy1qO03G9gpbNQEok84m4TYQ6gzEf-iS&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1460060671%3A1692460605102833");
	    
	    
	    driver.findElement(By.linkText("Help")).click();
	    Thread.sleep(2000);
	    
	    Set<String> allWindows = driver.getWindowHandles();
	    System.out.println(allWindows.size());
	    
	    Iterator<String> itr = allWindows .iterator();
	    String parentWindow =  itr.next();
	    String childwindow = itr.next();
	    System.out.println(parentWindow);
	    System.out.println(childwindow);
	    
	    driver.switchTo().window(childwindow);//needs to pas window handel
	    System.out.println(driver.getTitle());//help page title
	    driver.close();//close only one tab
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(parentWindow);
	    System.out.println(driver.getTitle());//gmail page title 
	    driver.quit();//close everything and kill driver,can not use driver after calling quit
	    
	}

}
