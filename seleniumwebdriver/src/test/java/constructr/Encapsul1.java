package constructr;

public class Encapsul1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is beginning");
		cityi c1 = new cityi("mumbai", 809098);
		cityi c2 = new cityi("hyderabad",987654);
		
		c1.diplaycitiinfo();
		c2.diplaycitiinfo();
		
		c1.setPopulation(900000);
		System.out.println("Updated population of "+c1.getCityname()+" :"+c1.getPopulation());
		
		
		}

}

class cityi{
	
	private String Cityname;
	private int population;
	
	public cityi(String Cityname,int population) {
		  this.Cityname=Cityname;
		  this.population=population;
	}

	public String getCityname() {
		return Cityname;
	}

	public void setCityname(String cityname) {
		Cityname = cityname;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void diplaycitiinfo() {
		System.out.println("city : "+Cityname+" , population :"+population);
	}
	
	
	
	
}
