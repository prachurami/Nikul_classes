package test;

public class IfconditionTest {

	public static void main(String[] args) {
		
    int a = 10;
    int b = 20;
    
    if(a==b) {
    	System.out.println("a and b are equal");
    }else {
    	System.out.println("a and b are not equal"); 	
    }
    String expected = "abc";
    String actual = "ABC";
    
    if(expected.equals(actual)) {
    	System.out.println("Test Pass");
    }else {
    	System.out.println("Test Fail");
    }
	}
		
}
   
