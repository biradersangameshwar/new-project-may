package practice_08_04_2025;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//By using third variable
		int a=10,b=20,t=a;
		/*System.out.println("Before swapping values are.."+a+"  "+b);
		a=b;
		b=t;
		System.out.println("After swapping values are.."+a+"  "+b);
		*/
		
		//With out usign third varible
	    /*System.out.println("Before swapping values are.."+a+"  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping values are.."+a+"  "+b);
		*/
		//By using * and / using third variable
		//here a & b values should not be zero
		System.out.println("Before swapping values are.."+a+"  "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping values are.."+a+"  "+b);
		
		

	}

}
