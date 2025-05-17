package samplejava;

public class Constructor_parameters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		six s1 = new six(10,20);
		//s1.banglore();
		six s2 = new six();

	}

}

class six {
	
	six(int a,int b){
		int c = a+b;
		System.out.println(c);
	}
	
	six () {
		System.out.println("This is Banglore");
	}
		
}