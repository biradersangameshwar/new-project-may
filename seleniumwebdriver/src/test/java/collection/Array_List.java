package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		//Declaration of arraylist
		//List mylist1 = new ArrayList();
		//ArrayList <String> mylist2 = new ArrayList <String>();
		ArrayList mylist = new ArrayList();
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("sangam");
		mylist.add('a');
		mylist.add(true);
		mylist.add(false);
		mylist.add(null);
		mylist.add(null);
		
		System.out.println("Size of an arraylist: "+mylist.size());
		
		System.out.println("printing data from arraylist: "+mylist);
		
		mylist.remove(6);
		System.out.println("After removing the duplicate : "+mylist);
		mylist.add(6, null);
		
		
		System.out.println("After adding the duplicate : "+mylist);
		
		//modifying
		mylist.set(2, "java");
		
		System.out.println("After modifying the duplicate : "+mylist);
		
		//access specific element from arraylist
		System.out.println(mylist.get(2));
		 mylist.clear();
		
		//reading all the elements from arraylist
		
		//by using for each loop
		for(Object v:mylist) {
			System.out.print(v+" ");
		}
		System.out.println();
		//by using for loop
		for(int i=0;i<=mylist.size()-1;i++) {
			System.out.print(mylist.get(i)+" ");
		}
		System.out.println();
		//by using iterator
		Iterator it = mylist.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		 
		
		
		
		

	}

}
