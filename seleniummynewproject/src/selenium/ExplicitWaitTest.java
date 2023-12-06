package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://echoecho.com/javascript4.htm");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    WebDriverWait Wait = new  WebDriverWait(driver, Duration.ofSeconds(20));//max second
	    
	    driver.findElement(By.name("B2")).click();
	    //Thread.sleep(2000);
	    
	    Wait.until(ExpectedConditions.alertIsPresent());
	    Alert al = driver.switchTo().alert();
	   
	    System.out.println(al.getText());//get text from alert
	    
	    //al.accept();//click on selectead button
	     al.dismiss();//close poppup

	}

}
