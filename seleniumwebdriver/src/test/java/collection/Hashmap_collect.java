package collection;

import java.util.HashMap;

public class Hashmap_collect {

	public static void main(String[] args) {
		// Declaration
		HashMap hm = new HashMap();
		
		hm.put(101, "sangam");
		hm.put(102, "sai");
		hm.put(103, "hari");
		hm.put(104,"raju");
		hm.put(105, "sai");
		//hm.put(102, "sai");
		hm.put(102, "uam");
		hm.put(102,"pavan");
		
		//System.out.println(hm);
		for(Object x:hm.entrySet()) {
			System.out.println(x);
		}
		
	
		
		
		
		
		System.out.println("Size of hashmap: "+hm.size());
		hm.remove(101);
		System.out.println("After removing pair: "+hm);
		
		System.out.println(hm.get(104));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		
		
		
		
		

	}

}
