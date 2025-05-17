package collection;

import java.util.ArrayDeque;

public class Fifo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> name = new ArrayDeque<String>();
		
		name.add("hari");
		name.add("hari");
		name.add("raju");
		System.out.println(name);
		name.pop();
		System.out.println(name);

	}

}
