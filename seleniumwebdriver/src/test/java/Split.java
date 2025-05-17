
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "this is beginning";
		//int len = str.length();
		String[] str1 = str.split(" ");
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]+" ");
			
		}

	}

}
