package test;

public class ArgumentsTest {

	public static void main(String[] args) {
		
      sum();//4+5
      sum(6,7);//6+7
      sum(10,10);//10+10
      sum(60,70);//60+70
      
	}
 
	
	public static void sum() {
		int a =4+5;
		System.out.println(a);
	}	
	public static void sum(int b,int c) {
		int a =b+c;
		System.out.println(a);
}
	public static void sum(int b, int c, int d) {
		int a = b+c+d;
		System.out.println(a);
	}
}
