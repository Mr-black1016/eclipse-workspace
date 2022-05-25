package VectorAssignment;
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
		StudentCreation.studentdata.add(0,pojo);
	}

	public void PrintAllElementPosition() {
		// TODO Auto-generated method stub
		for(int i=0;i<StudentCreation.studentdata.size();i++) {
			StudentPojo get = StudentCreation.studentdata.get(i);
			System.out.println("reg :"+get.getRegno());
			System.out.println("name:"+get.getName());
			System.out.println("age :"+get.getAge());
			System.out.println("emil:"+get.getEmail());
			
		}
	}

}
