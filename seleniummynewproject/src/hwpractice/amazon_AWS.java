package hwpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon_AWS {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.amazon.com/");
	    
	    driver.findElement(By.xpath("//a[text()='Amazon Web Services']")).click();
	    WebElement ele=driver.findElement(By.xpath("(//h1[@id='What_is_cloud_computing.3F'])[1]"));
	
	System.out.println(ele.getText());
	}

}
