import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UpdateSpecficStudentDetails {

	public void updatestudentdetails() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the student Regno:");
		int regnum= in.nextInt();
		for(StudentPojo pojo : Student1.studentdata ) {
			if(regnum == pojo.getRegno()) {
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

				pojo.setRegno(regno,name,age,email);
			}
		}
	}

	public void shuffleArrayList() {
		// TODO Auto-generated method stub
		System.out.println("shuufle array  list");
		Collections.shuffle(Student1.studentdata);
		for(StudentPojo pojo : Student1.studentdata )
		{
			System.out.println();
			System.out.println("Regno :"+pojo.getRegno());
			System.out.println("Name  :"+pojo.getName());
			System.out.println("age   :"+pojo.getAge());
			System.out.println("Email :"+pojo.getEmail());
		}
		
	}

	public void reverseArrayList() {
		// TODO Auto-generated method stub
		System.out.println("reverse a array  list");
		Collections.reverse(Student1.studentdata);
		for(StudentPojo pojo : Student1.studentdata )
		{
			System.out.println();
			System.out.println("Regno :"+pojo.getRegno());
			System.out.println("Name  :"+pojo.getName());
			System.out.println("age   :"+pojo.getAge());
			System.out.println("Email :"+pojo.getEmail());
		}
		
		
	}

	public void compareArrayList() {
		// TODO Auto-generated method stub
		
		System.out.println("Compare Two ArrayList");
		System.out.println();
		if(Student1.studentdata == StudentDetails1.studentdata1)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
	}

	public static void ExtractPosition() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the extractposition:");
		int position = scanner.nextInt();
		System.out.println("-----------------------");
		System.out.println();
		int i=0;
		for(StudentPojo pojo : Student1.studentdata )
		{
			if(i<position)
			{
			System.out.println();
			System.out.println("Regno :"+pojo.getRegno());
			System.out.println("Name  :"+pojo.getName());
			System.out.println("age   :"+pojo.getAge());
			System.out.println("Email :"+pojo.getEmail());
			}
			i++;
		}
	}

	public void SwapToArrayList() {
		// TODO Auto-generated method stub
		for(StudentPojo pojo : Student1.studentdata) {
			
			
		}
	}

	public void JoinTwoArrayList() {
		// TODO Auto-generated method stub

		System.out.println("Join Two Arraylist");
		System.out.println();
		StudentDetails1.studentdata1.addAll(Student1.studentdata);
		for(StudentPojo pojo : StudentDetails1.studentdata1 ) {
			System.out.println();
			System.out.println("Regno :"+pojo.getRegno());
			System.out.println("Name  :"+pojo.getName());
			System.out.println("age   :"+pojo.getAge());
			System.out.println("Email :"+pojo.getEmail());
		}
	}

	public void CloneArrayList() {
		// TODO Auto-generated method stub
		ArrayList<StudentPojo> arrayList = new ArrayList<StudentPojo>();
		System.out.println("Clone a ArrayList");
		System.out.println();
		arrayList =(ArrayList)Student1.studentdata.clone();
		for(StudentPojo pojo : arrayList)
		{
			System.out.println("Regno:"+pojo.getRegno());
			System.out.println("Name :"+pojo.getName());
			System.out.println("age  :"+pojo.getAge());
			System.out.println("email:"+pojo.getEmail());
		}
	}

}