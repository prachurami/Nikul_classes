package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://echoecho.com/javascript4.htm");
	    
	    driver.findElement(By.name("B2")).click();
	    Thread.sleep(2000);
	    
	    Alert al = driver.switchTo().alert();
	    System.out.println(al.getText());//get text from alert
	    
	    //al.accept();//click on selectead button
	   // al.dismiss();close poppup
	   
	    

	}

}
