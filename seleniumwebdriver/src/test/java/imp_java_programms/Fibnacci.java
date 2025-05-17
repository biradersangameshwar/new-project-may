package imp_java_programms;

public class Fibnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=10,a=0,b=1;
        for(int i=1;i<=num;i++) {
        	System.out.println(a+" ");
        	int sum = a+b;
        	a=b;
        	b=sum;
        }
	}

}
