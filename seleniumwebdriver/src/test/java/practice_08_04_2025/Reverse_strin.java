package practice_08_04_2025;

import java.util.Scanner;

public class Reverse_strin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		String rev = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			char c = str.charAt(i);
			
			if(rev.indexOf(c) == -1) {
				rev = rev+c; 					
			}
		}
		
		System.out.println(rev);
	}

}
