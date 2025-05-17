package constructr;

public class Polymarhysm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c = new calculator();
		System.out.println("Additing of two numbers :"+c.add(5, 10));
		System.out.println("Addtion & multiplication : "+c.add(2, 3, 4));
		System.out.println("Subraction of two numbers :"+ c.add(4, 2));

	}

}

class calculator{
	 int add(int a,int b) {
		return a+b;
		}
	 int add(int a,int b,int c) {
		return a+b*c;
		  }
	 double add(double a,double b) {
		return a-b;
		 
	 }
	
}
