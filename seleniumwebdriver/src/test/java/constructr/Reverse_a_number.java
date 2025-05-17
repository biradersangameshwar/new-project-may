package constructr;

import java.util.Scanner;

import batch_129.Rverese_by_stringbuffer;

public class Reverse_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long num = sc.nextLong();
        String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();
        String reversed1 = new StringBuilder(String.valueOf(num)).reverse().toString();
        
        System.out.println("reversed number : "+reversed);
        sc.close();
		
		

	}

}
