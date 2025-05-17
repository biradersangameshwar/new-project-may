package collection;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> name = new LinkedList<String>();
	     name.add("suresh");
	     name.add("ramesh");
	     name.add("mahesh");
	     name.add("paresh");
	     System.out.println(name);
	     name.addFirst("hari");
	     System.out.println(name);
	     name.addLast("suri");
	     System.out.println(name);
	     name.add("shankar");
	     System.out.println(name);
	     name.add(3, "ramesh");
	     System.out.println(name);
	     
	     

	}

}
