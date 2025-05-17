
public class rev_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sangameshwar";
		String reversed = " ";
		
		for (int i=str.length()-1; i>=0; i--) {
			
			reversed += str.charAt(i);
			//System.out.println(reversed);
		}
		System.out.println(reversed);
	}

}
