package array;

import java.util.Arrays;

public class Demo_method_arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is beginning");
		
		int num[] = {99,33,44,54,98,87,76};
		
		for(int i=0;i<num.length;i++) {
			Arrays.sort(num);
			System.out.print(num[i]+" ");
		}
		
		int digit1[] = {11,22,33,44,55};
		int ditit2[] = {11,22,32,44,55};
		
		System.out.println();
		boolean b1 = Arrays.equals(digit1, ditit2);
		System.out.println(b1);

	

	
	int num3[] = Arrays.copyOf(num, 8);
	for (int i=0;i<num.length;i++) {
		System.out.println(num3[i]+" ");
	}
	
	}	
}
