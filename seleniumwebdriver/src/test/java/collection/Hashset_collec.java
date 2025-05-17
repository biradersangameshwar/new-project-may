package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset_collec {

	public static void main(String[] args) {
		//Declaration
		
		HashSet myset = new HashSet();
		
		myset.add(100);
		myset.add("sangam");
		myset.add(100);
		myset.add(null);
		myset.add('a');
		myset.add(null);
		myset.add("sangam");
		
		System.out.println(myset);
		System.out.println(myset.isEmpty());
		
	//	myset.remove("sangam");
		
		System.out.println("after removing: "+myset);
		
		//converting Hashset-->Arraylist
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		
		System.out.println(al.get(1));
		
		for(Object x:myset) {
			System.out.print(x+" ");
		}
		
		System.out.println(" ");
		
		Iterator it = myset.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
        //clearing all the values in hashset
		
		myset.clear();
		
		System.out.println(myset.isEmpty());
		System.out.println(myset);
		
	}

}
