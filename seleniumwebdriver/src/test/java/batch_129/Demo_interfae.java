package batch_129;

public class Demo_interfae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//car c = new car("tata", 4);
		//c.displayinfo();
		electricCar ec = new electricCar("tata",6,240);
		ec.displayelectricinfo();
		bike b1 = new bike("Java",90);
		b1.displaybikeinfe();
		

	}

}
class vehicle{
	private String brand;
	vehicle(String brand){
		this.brand=brand;
	}
	public void dispalyinfo() {
		System.out.println("Brand Name : "+brand);
	}
}
class car extends vehicle{
	private int doors;
	 car(String brand, int doors){
		 super(brand);
		 this.doors=doors;
	 }
	public void displayinfo() {
		super.dispalyinfo();
		System.out.println("Doors : "+doors);
		
	}
}
class electricCar extends car{
	private int batterycapacity;
	electricCar(String brand , int doors ,int batterycapacity){
		super(brand, doors);
		this.batterycapacity=batterycapacity;
	}
	void displayelectricinfo() {
		displayinfo();
		System.out.println("Battery capacity :"+batterycapacity+"kwh");
		
	}
}
class bike extends vehicle {
	 private int speed;
	 
	 public bike(String brand,int speed) {
		 super(brand);
		 this.speed = speed;
		 
	 }
	 void displaybikeinfe() {
		 dispalyinfo();
		 System.out.println("bike speed : "+speed);
	 }
}

