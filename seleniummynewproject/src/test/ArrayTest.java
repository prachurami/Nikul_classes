package test;

public class ArrayTest {

	public static void main(String[] args) {
	
		String tool= "Selenium";
		System.out.println(tool);
		
		String tools[] = {"Selenium","Java","Junit","Testng","Testlink"};
		System.out.println(tools.length);
		
		/*System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);*/
		
		for(int i= 0; i<tools.length ; i++) {
			System.out.println(tools[i]);
		}
	    System.out.println("-------------------------------------------");
	    
	    int numbers[] = {1, 40, 250, 1000, 5000 };
	    System.out.println(numbers.length);
	    
	    for(int i=0; i<numbers.length;i++) {
	    	System.out.println(numbers[i]);
	    }
	    System.out.println("---------------------------------------------");
	    
	    Object mix[] = {"Hello",5,10.12,'c'};
	    System.out.println(mix.length);
	    	
	    	for(int i=0;i<mix.length;i++) {
	    		System.out.println(mix[i]);
	    	}
	    }
	    
	}
