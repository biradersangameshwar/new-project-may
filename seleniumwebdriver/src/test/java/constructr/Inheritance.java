package constructr;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vehicle v1 = new vehicle("tata");
		//v1.displayinfo();
		//car3 c1 = new car3("tata", 4);
		//c1.displayinfo();
		Cngcar c2 = new Cngcar("Tata",5,"Black");
		c2.displaycngcar();

	}

}
class vehicle{
	private String brand;
	
	public vehicle(String brand) {
		this.brand=brand;
		//s=brand;
	}
	public void displayinfo(){
		System.out.println("Brand Name :"+brand);
	}
}
class car3 extends vehicle{
	
	private int doors;
	public car3(String brand,int doors) {
		super(brand);
		this.doors=doors;
		}
	public void displayinfo1() {
		System.out.println("doors :"+ doors);
	}
	
}

class Cngcar extends car3 {
	private String colour;
    public Cngcar(String brand, int doors, String colour) {
		super(brand, doors);
		this.colour=colour;
		}
	public void displaycngcar() {
		System.out.println("Colour of car is :"+ colour);
		super.displayinfo1();
		super.displayinfo();
	}
}
	
