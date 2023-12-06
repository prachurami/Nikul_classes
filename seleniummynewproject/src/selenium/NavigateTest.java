package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
	    //driver.get("https://www.google.com/");

		driver.navigate().to("https://www.google.com/");
		
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    
	}

}
