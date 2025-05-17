package oops_concept;

public class Demo_class_object {

	 public int eid;
	 public String ename;
	 public String job;
	 public int sal;
	        
	 public void display(){
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		System.out.print(" ");
		System.out.println(" ");
		
		
		
	}
	
	public static void main(String[] args) {
		
		Demo_class_object dc = new Demo_class_object();
		dc.eid=101;
		dc.ename="sangam";
		dc.job="traniee";
		dc.sal=20000;
		dc.display();
		
		//System.out.print(" ");
		
		Demo_class_object dc1 = new Demo_class_object();
		dc1.eid=102;
		dc1.ename="hari";
		dc1.job="traniee";
		dc1.sal=2000;
		dc1.display();

	}

}
