package practice_08_04_2025;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i>=0;i++) {
			if(num%i==0)
				count++;
			sc.close();
		}
		if(count==2) {
			System.out.println(num +" is a prime number");
		}
		else
			System.out.println(num +" is not a prime number");
		}
		

	}


