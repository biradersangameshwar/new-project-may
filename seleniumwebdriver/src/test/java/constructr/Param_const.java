package constructr;

public class Param_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is beginning");
		emp e1 = new emp(101, "harish");
		emp e2 = new emp(102,"raju");

	}

}
class emp{
	emp(int id,String name){
		System.out.println(id+" "+name);
	}
}



