package array;

public class Obj_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("This is beginning");
    emp e1[] = new emp[3];
    e1[0]= new emp(101,"sangam");
    e1[1]=new emp(102,"sumeeth");
    e1[2]=new emp(103,"raju");
   // e1[3]=new emp(104,"sai");
		}

}
class emp{
	emp(int id,String name){
		System.out.println("Emp_id = "+id);
		System.out.println("Emp_Name ="+name);
		
	}
}
