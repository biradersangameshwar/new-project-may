package constructr;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is beginning");
		int a=0;
		int b=1;
		int c=15;
		System.out.println(a+" "+b);
		for (int i=2; i<=c ; i++) {
			int d=a+b;
			System.out.print(" "+d);	
			a=b;
			b=d;

	}
	}
}
