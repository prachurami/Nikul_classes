package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShortTest {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.com/");
		
	    //add commons.io jar to the project
	    
	    File screenShotFile =driver.getScreenshotAs(OutputType.FILE);//this is for firfoxdriver,
	                                                         //chrodriver or any class driver
	    //File Scrfile=((takesscreenshot)driver).getscreenshot(outputType.file);//
	    //this line is for webdriver
	    FileUtils.copyFile(screenShotFile, new File("c:/QA/Testing/screenshot.png"));
	    
	}

}
