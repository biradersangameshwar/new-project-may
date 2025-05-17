package constructr;

public class Param_const3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is beginning");
		state bng = new state("banglore",55000);
		state pune = new state("pune",35000);
		
	//	bng.display();
	//	pune.display();

	}

}
class state{
	String cityName;
	int Population;
	state(String name,int popu){
		cityName=name;
		Population=popu;
	
	
	//void display() {
		System.out.println("cityname "+cityName);
		System.out.println("population "+Population);		
	}
}

