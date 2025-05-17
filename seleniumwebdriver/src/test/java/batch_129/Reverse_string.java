package batch_129;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sangameshwar";
		int len = str.length();
		System.out.println("This is length of the string :"+ len);
		char ch[] = str.toCharArray();
		
		for(int i=len-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		}
}
