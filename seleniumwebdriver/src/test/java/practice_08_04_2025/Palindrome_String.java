package practice_08_04_2025;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		String rev = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		sc.close();
		if(str.equals(rev)) {
			System.out.println("this is palindrome");
		}
			else
				System.out.println("not a palindrome");
		}
		
		
	}


