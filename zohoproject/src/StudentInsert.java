import java.util.Scanner;

public class StudentInsert {

	public void studentInsert() {
		// TODO Auto-generated method stub
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
		Student1.studentdata.add(0,pojo);
	}

}
