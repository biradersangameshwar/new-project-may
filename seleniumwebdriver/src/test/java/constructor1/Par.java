package constructor1;

public class Par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emploi e1 = new emploi(101,"sangam");
		emploi e2 = new emploi("sai",102);
		

	}

}

class emploi{
	int id;
	String name;
	long mobile;
	String deptname;



   emploi(int i,String nam){
	   id=i;
	   name=nam;
	   System.out.println(i+" "+nam);
   }
   emploi(String nam,int i){
	   name=nam;
	   id=i;
	   System.out.println(i+" "+nam);
   }
}
   


