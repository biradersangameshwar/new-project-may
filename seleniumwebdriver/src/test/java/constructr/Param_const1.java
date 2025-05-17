package constructr;

public class Param_const1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is beginning");
		car c1 = new car("maruthi", "black", 1990);

	}

}

 class car{
	
	car(String model,String colour,int year ){
		
		System.out.println(model+" "+colour+" "+year);
		
		
	}
}


