package constructr;

public class Method_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is beginning");
		print p1 = new print();
		p1.pri("abhi");
		p1.pri();
		p1.pri(8019653677l);
		
	}
}
class print{
public void pri() {
	System.out.println("this is method");
}
public void pri(String name) {
	System.out.println("this is method2 :"+ name);
}
public void pri(long mobi) {
	System.out.println("this is method3 :"+ mobi);
}



}
