package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipuleBrowsearTest1 {

	public static void main(String[] args) {
		
		Xls_Reader d = new Xls_Reader("C:\\QA\\Testing\\NikulTest.Xlsx");
		
		String browser =d.getCellData("Data1","Browser" , 2);//chrom,safari//we read broweser value from data file,like excel, properties. 
		WebDriver driver;//at this stage drive is null
		
		if(browser.equals("Firefox")) {
			 driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			driver = new ChromeDriver();			
		}else {
			 driver = new SafariDriver();
		}
		
			driver.get("https://www.facebook.com/");	
			
			driver.findElement(By.id("email")).sendKeys(d.getCellData("Data1", "UserName", 3));
			driver.findElement(By.id("pass")).sendKeys(d.getCellData("Data1", "Password", 2));
			driver.findElement(By.name("login")).click();

	}

	}


