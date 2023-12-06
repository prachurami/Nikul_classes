package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.ebay.ca/");
	    
        Thread.sleep(6000);
		
		WebElement Registration = driver.findElement(By.linkText("Registration"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//Option 1 - By X and Y Cordinate
		//System.out.println(Registration.getLocation());
		//jse.executeScript("window.scrollBy(0,2000)");
		
		//Option 2- Scroll until element is in the view is true
		//jse.executeScript("arguments[0].scrollIntoView(true);", Registration);
		
		//option 3 - direct click using JavascriptExecuter Class Test
		jse.executeScript("arguments[0].click();", Registration);
		
	}

}
