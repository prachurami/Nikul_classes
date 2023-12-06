package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSuggestList {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	    WebDriverWait Wait = new  WebDriverWait(driver, Duration.ofSeconds(20));

		driver.findElement(By.name("q")).sendKeys("canada");
		//Thread.sleep(2000);
		
		Wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role=\"listbox\"]//li"),10));
		List<WebElement>all = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
	    all.size();
		
		for(int i=0; i<all.size();i++) {
			System.out.println(all.get(i).getText());
		}
	}
}
