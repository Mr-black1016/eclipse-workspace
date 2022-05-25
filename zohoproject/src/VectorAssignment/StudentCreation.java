package VectorAssignment;
import java.util.Scanner;
import java.util.Vector;

public class StudentCreation {
	protected long regno;
	protected String name;
	protected int age;
	protected String email;
	protected static Vector<StudentPojo> studentdata = new Vector<StudentPojo>();
	

	public void student1() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the student details");
		System.out.println();
		System.out.println("enter the regno:");
		long regno = in.nextLong();
		System.out.println("enter the name:");
		in.nextLine();
		String name= in.nextLine();
		System.out.println("enter the age:");
		int age = in.nextInt();
		System.out.println("enter the email");
		in.nextLine();
		String email = in.nextLine();
//	
		StudentPojo pojo = new StudentPojo();
		pojo.setRegno(regno,name,age,email);
		studentdata.add(pojo);
		
		
	}
	
	
}