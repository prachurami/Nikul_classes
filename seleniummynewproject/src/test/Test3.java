package test;

public class Test3 {

	static Test3 t3=new Test3();
	static Test1 t1=new Test1();
	
	public static void main(String[] args) {
		//3. call circle
		circle();
		//4. call square
		t3.square();
		//7.call printme()from test1
		Test1.printMe();
		//8. call testme()from Test1
		t1.testme();
		
	}
	public static void circle() {
		System.out.println();
	}
	public void  square() {
		System.out.println("square");
	}
}
