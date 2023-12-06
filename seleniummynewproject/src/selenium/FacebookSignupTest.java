package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    
	   
	    driver.findElement(By.linkText("Create new account")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("lastname")).sendKeys("usgfyugufg");
	    driver.findElement(By.name("reg_email__")).sendKeys("782738972367");
	    driver.findElement(By.id("password_step_input")).sendKeys("dushduhs");
	    
	    WebElement month = driver.findElement(By.id("month"));
	    Select m =new Select(month);
	    m.selectByValue("7");
	    
	    WebElement day = driver.findElement(By.id("day"));
	    Select d =new Select(day);
	    d.selectByVisibleText("10");
	    
	    WebElement Year = driver.findElement(By.id("year"));
	    Select y =new Select(Year);
	    y.selectByVisibleText("2000");
	    
	    //click on radio butoondriver.findElement(By.xpath("//input[@value='2']")).click();
	    driver.findElement(By.name("websubmit")).click();
}
}