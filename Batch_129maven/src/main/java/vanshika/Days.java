package vanshika;

public class Days {

	public static void main(String[] args) {
	

		int day =8;
		String dayname;
		switch(day){
			case 1: 
				dayname ="monday";
			break;
			case 2:
				dayname ="tueday";
			break;
			case 3:
				dayname ="wednesday";
			break;
			case 4:
				dayname ="thusday";
			break;
			case 5:
				dayname ="friday";
			break;
			case 6:
				dayname ="saturday";
			break;
			case 7:
				dayname ="sunday";
			break;
			default:
			dayname ="vaild dayname ";
		}	
			
			System.out.println("the day is : " + dayname);	
		}
	        
}

