package array;

import java.util.Arrays;

public class Sorting_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {11,22,33,4,5,66,1,2,4,55,66,7};
		
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(a));
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
			
		}
		
		
		
		Arrays.sort(a);
		
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(a));

	}

}
