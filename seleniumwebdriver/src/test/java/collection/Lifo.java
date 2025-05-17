package collection;

import java.util.Stack;

public class Lifo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> name = new Stack<String>();
		name.add("harish");
		name.add("suresh");
		name.add("raju");
		name.add("suresh");
		
		System.out.println(name);
		name.pop();
		System.out.println(name);

	}

}
