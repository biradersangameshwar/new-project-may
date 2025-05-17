package constructr;



public class Hirerchicl_inheri {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		vehicle2 v = new vehicle2("honda",1989);
		v.diplayinfo();
		v.dispayinfo1();
		vehicle3 v1 = new vehicle3("honda","black");
		v1.displayinfo3();
		

	}

}
class vehicle1{
	public String bike;
	
	public vehicle1(String bike) {
		this.bike = bike;
	}
	public void diplayinfo() {
		System.out.println("Bike name is :"+ bike);
	}
}	
class vehicle2 extends vehicle1{
        
	public int model;
	
	public vehicle2(String bike,int model) {
		super(bike);
		this.model=model;
		}
	public void dispayinfo1() {
		System.out.println("Bike model is :"+model);
	}
}	
	class vehicle3 extends vehicle1{
            public String colour;
		public vehicle3(String bike,String colour) {
			super(bike);
			this.colour=colour;
			}
		public void displayinfo3() {
			System.out.println("colour of bike is :"+colour);
			}
		
	}

	

	
	
	










