package oops_concept;

public class Poly_demo {
	
	int a=10,b=20;
	
	void sum() {
		System.out.println(a+b);
	}
	int sum1() {
		return a+b;
		
	}
	
	
	void sum(int x, int y) {
	
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Poly_demo pl = new Poly_demo();
		pl.sum();
		pl.sum(10, 20);
		

	}

}
