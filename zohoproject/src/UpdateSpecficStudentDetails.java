import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UpdateSpecficStudentDetails {

	public void updatestudentdetails() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the student Regno:");
		int regnum= in.nextInt();
		for(StudentPojo pojo : StudentCreation.studentdata ) {
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
		Collections.shuffle(StudentCreation.studentdata);
		for(StudentPojo pojo : StudentCreation.studentdata )
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
		Collections.reverse(StudentCreation.studentdata);
		for(StudentPojo pojo : StudentCreation.studentdata )
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
		if(StudentCreation.studentdata == StudentViewer.studentdata1)
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
		for(StudentPojo pojo : StudentCreation.studentdata )
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
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter index one:");
		int i=scanner.nextInt();
		System.out.println("enter second index:");
		int j=scanner.nextInt();
		StudentPojo pojo1=StudentCreation.studentdata.get(i);
		StudentPojo pojo2=StudentCreation.studentdata.get(j);
		if(pojo1 != null && pojo2 != null) {
			StudentPojo temp=pojo2;
			StudentCreation.studentdata.set(j, pojo1);
			StudentCreation.studentdata.set(i, temp);
		}
		else {
			System.out.println("Index position wrong");
		}
		
	}

	public void JoinTwoArrayList() {
		// TODO Auto-generated method stub

		System.out.println("Join Two Arraylist");
		System.out.println();
		StudentViewer.studentdata1.addAll(StudentCreation.studentdata);
		for(StudentPojo pojo : StudentViewer.studentdata1 ) {
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
		arrayList =(ArrayList)StudentCreation.studentdata.clone();
		for(StudentPojo pojo : arrayList)
		{
			System.out.println("Regno:"+pojo.getRegno());
			System.out.println("Name :"+pojo.getName());
			System.out.println("age  :"+pojo.getAge());
			System.out.println("email:"+pojo.getEmail());
		}
	}

	public void EmptyAarrayList() {
		// TODO Auto-generated method 
		System.out.println();
		StudentCreation.studentdata.clear();
		System.out.println("Clear the all data from the student details");
	}

	public void ArrayListEmptyOrNot() {
		// TODO Auto-generated method stub
		boolean s =StudentCreation.studentdata.isEmpty();
		if(s) {
			System.out.println(" ArrayList is Empty");
		}
		else {
			System.out.println("Arraylist non Empty");
		}
		
	}

	public void TrimCapacity() {
		// TODO Auto-generated method stub
		StudentCreation.studentdata.trimToSize();
		for(StudentPojo pojo : StudentCreation.studentdata)
		{
			System.out.println("Regno:"+pojo.getRegno());
			System.out.println("Name :"+pojo.getName());
			System.out.println("age  :"+pojo.getAge());
			System.out.println("email:"+pojo.getEmail());
		}
		
	}

	public void IncreaseSizeArrayList() {
		// TODO Auto-generated method stub
		StudentCreation.studentdata.ensureCapacity(100);
		
	}

}
