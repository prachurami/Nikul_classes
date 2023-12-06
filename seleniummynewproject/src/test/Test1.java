package test;

import selenium.Test4;

public class Test1 {
	
	//ClassName ObjectName = new ClassName();
	static Test1 t1 = new Test1();
    static Test2 t2 = new Test2();
    static Test3 t3 = new Test3();
    static Test4 t4 = new Test4();
    //ctrl+shift+o
    
	public static void main(String[] args) {
		
		System.out.println("I'm in Main Method");
		scanme();
		printMe();
		System.out.println("After Printme");
		t1.testme();
		t1.paintme();
		Test2.red();
		t2.blue();
		//5. call circle
		Test3.circle();
		//6. call square
		t3.square();
		Test4.bmw();
		t4.audi();
		ArgumentsTest.sum();//100+100
		
	}
	public static void printMe() {
		System.out.println("PrintMe");
		
	}
	
	public static void scanme() {
		System.out.println("scanme");
	}
	public void testme() {
		System.out.println("testme");
	}
	public void paintme() {
		System.out.println("paintme");
	}
}
