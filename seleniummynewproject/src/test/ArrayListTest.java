package test;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

public class ArrayListTest {

	public static void main(String[] args) {
		//className objName = new className();
		ArrayList<String> tools = new ArrayList<String>();

		tools.add("selenium");
		tools.add("java");
		tools.add("junit");
		tools.add("Testing");
		System.out.println(tools.size());//4
		
		/*System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));*/
		
		/*for(int i=0;i<tools.size();i++) {
			System.out.println(tools.get(i));
		}*/
		
		for (String s: tools) {
			System.out.println(s);
		}
		
		
		tools.remove(2);//remove junit
		System.out.println(tools.size());//3
		System.out.println(tools.get(2));//TestNg
		
				
	}
}
