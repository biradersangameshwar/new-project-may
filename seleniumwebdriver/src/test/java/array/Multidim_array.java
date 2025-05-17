package array;

public class Multidim_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is beginning");
		
		int a[][] = new int[2][3];
		
		a[0][0]=2;
		a[0][1]=3;
		a[0][2]=4;	
		a[1][0]=5;
		a[1][1]=6;
		a[1][2]=7;
		
		for(int r=0;r<2;r++) {
			for(int c=0;c<3;c++) {
				System.out.println(a[r][c]);
			}
		}

	}

}
