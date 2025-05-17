package array;

public class Serching_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,22,33,44,55,66};
		int search_ele = 11;
		boolean status = false;
		
		for(int i=0;i<=a.length;i++) {
			if(a[i] == search_ele) {
				System.out.println("element found");
				status = true;
				break;
				}
			
		}if(status==false) {
			System.out.println("element not found");
		

	}

}
}