package constructr;

public class Param_const5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is beginning");
		empl e1 = new empl(101,"sai");
		empl e2 = new empl(102,"hari",8019653677l);
		empl e3 = new empl(104,"raju",8019653677l,"IT");
		
	}
}

class empl{
	int id;
	String name;
	long mobile;
	String dept;
	String address;
	
	empl(int i,String n){
		id =i;
		name =n;
		System.out.println(i+" "+n);
	}
	empl(int i,String n,long m){
		id =i;
		name=n;
		mobile=m;
		System.out.println(i+" "+n+" "+m);
	}
	empl(int i,String n,long m,String d){
		id=i;
		name=n;
		mobile=m;
		dept=d;
		System.out.println(i+" "+n+" "+m+" "+d);
	}
}