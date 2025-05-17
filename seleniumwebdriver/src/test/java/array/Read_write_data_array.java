package array;

import java.util.Arrays;
import java.util.Scanner;

public class Read_write_data_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a number");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		sc.close();
		
		

	}

}
