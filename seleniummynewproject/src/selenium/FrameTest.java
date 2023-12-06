package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
	
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://jqueryui.com/droppable/");
      
	    List<WebElement> Sortable = driver.findElements(By.linkText("Sortable"));
	    System.out.println(Sortable.size());
	    
	    if (Sortable.size()>0) {
	    	System.out.println("Sortable Present");
	    }else {
        System.out.println("Sortable Not Present");

}
	    //option 2 
	    
	    List<WebElement> draggable= driver.findElements(By.id("draggable"));
	    System.out.println(draggable.size());
	    
	    if (draggable.size()>0) {
	    	System.out.println("draggable present");
	    }else {
        System.out.println("draggable not present");
	}
	    driver.switchTo().frame(0);//by ind
	    //driver.switchTo().frame("demo-frame");//by string- only for name and id attribute,In this case we can not use this option as no id or name
	    //driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//by webelement
	    System.out.println("-------------after switching to frame-------------------");
	    
	    Sortable = driver.findElements(By.linkText("Sortable"));
	    System.out.println(Sortable.size());
	    
	    if (Sortable.size()>0) {
	     	System.out.println("Sortable Present");
	    }else {
            System.out.println("Sortable Not Present");	   
}
	    draggable= driver.findElements(By.id("draggable"));
	    System.out.println(draggable.size());
	    
	    if (draggable.size()>0) {
	    	System.out.println("draggable present");
	    }else {
        System.out.println("draggable not present");
}	
	    System.out.println("------------------switching back to main page-----------");
	    
	    driver.switchTo().defaultContent();//take you to main page
	    
	    Sortable = driver.findElements(By.linkText("Sortable"));
	    System.out.println(Sortable.size());
	    
	    if (Sortable.size()>0) {
	     	System.out.println("Sortable Present");
	    }else {
            System.out.println("Sortable Not Present");	   
}
	    draggable= driver.findElements(By.id("draggable"));
	    System.out.println(draggable.size());
	    
	    if (draggable.size()>0) {
	    	System.out.println("draggable present");
	    }else {
        System.out.println("draggable not present");
}	
	}
}