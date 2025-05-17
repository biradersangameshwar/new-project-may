package array;

public class Multi_dim {

	public static void main(String[] args) {
		
		int[][] num = {{1,2,3,3},
				       {4,5,6,6},
				       {7,8,9,9},
				       {2,3,4,5}};
		
		System.out.println("length of rows: "+num.length);
		System.out.println("length of columns: "+num[0].length);
		
		for (int r =0;r<num.length-1;r++) {
			for(int c=0;c<num[0].length-1;c++) {
				System.out.print(num[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println(" ");
		
            for(int arr[]:num) {
			for(int x:arr) {
				System.out.print(x+ " ");
			}
			System.out.println();
		}
		
		

	}

}
