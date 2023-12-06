package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException{
		
		FirefoxDriver driver = new FirefoxDriver();
		
	    driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-GB&ifkv=AXo7B7WY1t-iKoSog7o8Qgx8LtxFWanc7NFyX8MItMi1dy1qO03G9gpbNQEok84m4TYQ6gzEf-iS&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1460060671%3A1692460605102833");
	    //enter wrong email
	    driver.findElement(By.id("identifierId")).sendKeys("uhfuihudhfdnfdjfiojfillofklkofjko");
	    //click on next button
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    
	    Thread.sleep(2000);
	    
	    String expecteadErr = "Couldn’t find your Google Account";
	    String actualErr = driver.findElement(By.xpath("//div[@class='o6cuMc Jj6Lae']")).getText();
	    System.out.println(actualErr);
	    
	    if (expecteadErr.equals(actualErr)) {
	    	System.out.println("Pass");
	    }else {
	    	System.out.println("Fail");
	    }      
	}
}
