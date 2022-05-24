package CollectionProgramTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int regno;
		String name;
		long mobno;
		System.out.println("enter the regno:");
		regno=in.nextInt();
		System.out.println("enter the name:");
		in.nextLine();
		name=in.nextLine();
		System.out.println("enter the mobile no:");
		mobno=in.nextLong();
		
	    student s1 = new student(regno,name,mobno);
 	    ArrayList<student> arrayList = new ArrayList<student>();
	    arrayList.add(s1);
	   Iterator iterator = arrayList.iterator();
	   System.out.println("------------student details:------------");
	   while(iterator.hasNext())
	   {
		   student st=(student)iterator.next();
		   
		   System.out.println(st.regno+" "+st.name+" "+st.mobno);
	   }
	}

}
