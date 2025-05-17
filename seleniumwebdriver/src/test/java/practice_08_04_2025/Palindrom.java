package practice_08_04_2025;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	    int num  =sc.nextInt();
	    String original = String.valueOf(num);
	    StringBuilder sb = new StringBuilder(original);
	    String reversed = sb.reverse().toString();
	    System.out.println(reversed);
	   
	    
	    
	   if(original.equals(reversed)) {
		   System.out.println("this is palindrome");
	   }
	   else
		   System.out.println("this is not palindrome");
	   }
}	

		

	


