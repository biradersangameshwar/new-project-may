
public class String_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		String str = "Sangameshwar";
		String str1 = "Disclaimair";
		
		StringBuilder sb = new StringBuilder(str);
	    System.out.println(sb.reverse().toString());
	    
	    StringBuffer sb1 = new StringBuffer(str1);
	    System.out.println(sb1.reverse().toString());
	    
	}
}