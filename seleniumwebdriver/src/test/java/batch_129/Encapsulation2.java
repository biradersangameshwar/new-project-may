package batch_129;

public class Encapsulation2 {

	public static void main(String[] args) {
		
		System.out.println("this is beginning");
		city2 c1 = new city2("banglore" , 80000);
		city2 c2 = new city2("pune" , 90000);
		city2 c3 = new city2("goa" , 95000);
		c1.displaycityinfo();
		c2.displaycityinfo();
		c3.displaycityinfo();
	}
		
	}
class city2 {
	private String cityname;
	private int population;
	
	public city2(String cityname, int population) {
		this.cityname = cityname;
		this.population = population;
	}

	public String getcityname() {
		return cityname;
	}

	public void setcityname(String cityname) {
		this.cityname = cityname;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void displaycityinfo() {
		System.out.println("city : "+cityname+" population : "+population);
	}
}


