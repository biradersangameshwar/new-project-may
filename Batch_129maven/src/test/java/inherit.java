

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("This is Beginning");
		
ElectricCar EV = new ElectricCar("tata",4,75);
EV.displayInfo();		

Car c1 = new Car("TATA",4);
c1.displayCarInfo();
		

	}

}
// Super Class
class Vehicle{
	
	private String brand;
	
	public Vehicle(String brand) {
		this.brand=brand;
	}
	
	public void displayInfo() {
		System.out.println("Brand Name : "+brand);
	}
}
// Sub Class
class Car extends Vehicle{
	
	private int doors;
	public Car(String brand , int doors) {
		super(brand);
		this.doors = doors;
	}
	
	public void displayCarInfo() {
		super.displayInfo();
		System.out.println("Doors : "+doors);
	}
}
class ElectricCar extends Car{
	  private int batterCapacity;
	  
	  public ElectricCar(String brand , int doors , int batterCapacity ) {
		  super(brand , doors);
		  this.batterCapacity = batterCapacity;
	  }
	  public void displayInfo() {
		  super.displayInfo();
		  System.out.println("Battery Capacity : "+ batterCapacity + "KWh");
	  }
}

	