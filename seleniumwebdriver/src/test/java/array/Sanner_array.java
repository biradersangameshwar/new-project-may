package array;

import java.util.Scanner;

public class Sanner_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a=  sc.nextInt();
		int b = sc.nextInt();
		
		int sum =0;
		System.out.println("value of a:"+a+ "value of b:"+b);
		sum = a+b;
		System.out.println(sum);
		sc.close();
		
		

	}

}
