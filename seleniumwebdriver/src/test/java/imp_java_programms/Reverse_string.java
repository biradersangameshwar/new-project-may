package imp_java_programms;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "Selenium";
         int len = str.length();
         char ch[] = str.toCharArray();
         for(int i=len-1;i>=0;i--) {
        	  System.out.print(ch[i]);
         }
         System.out.println();
         StringBuilder sb = new StringBuilder(str);
         System.out.println(sb.reverse().toString());
         
         StringBuffer sb1 = new StringBuffer(str);
         System.out.println(sb1.reverse().toString());
		
		
	}

}
