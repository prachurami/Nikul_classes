package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=TFasMktbGPw&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiVEZhc01rdGJHUHciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY5MTk0MjMyNSwiaWF0IjoxNjkxOTQxMTI1LCJqdGkiOiJjMmNhMmY4ZC1jZDBkLTQyMzEtOTM0YS03MzRiOTg1ODU0ZjUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.f4zRErnK3xhXcGpN9SJvllRBuHR0uwG8BluRLzRvbbiaPaNcayMx552NitmUfShf2h7DwhWdnU4JAh5NbI5qDJCkiE5j0SwTq_Cnh7bGOBCeybZXlAP-YNsNuBIE2xZl5TkZXUPTcQ3RNGpXHCpEzRzb2vkYKXtQF6M4g7LuGCrng0Gc6Oof4dCBchjjshmy68pjxJI_JZMPWpdAoyKTnkFu0iDu69FSoAz_GxixpgNMVclEtwc2fbfLdlt18_V6x0ZFg03biQ2RHtMrptf2CIgmnWXJd2EffkgML_blLOz9SZTlN6ScMisB0D1sVjoW3blGLDAM_S1bR6DWnH27qQ&preferred_environment=");
	    
	    driver.findElement(By.id("usernameInput-input")).sendKeys("yefhhfh@fgwdg");
	    driver.findElement(By.name("password")).sendKeys("hdshduksh");
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	    
	    Thread.sleep(2000);

	    String expectedErr = "Please check your card number / username or password and try again.";
	    String actualErr = driver.findElement(By.id("UsernameTextfiled_errors-usernameInput")).getText();
	    System.out.println(actualErr);
	    
	    if(expectedErr.equals(actualErr)) {
	    	System.out.println("Test Pass");
	    }else {
	    	System.out.println("Test Fail");
	    }
	}
}
