package LinkedListAssignment;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class StudentViewer {
	protected static LinkedList<StudentPojo> studentdata1 = new LinkedList<StudentPojo>();

	public void studentdetails1() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("student details");
		System.out.println();
		for(StudentPojo pojo : StudentCreation.studentdata) {
			System.out.println();
			System.out.println("Regno :"+pojo.getRegno());
			System.out.println("Name  :"+pojo.getName());
			System.out.println("age   :"+pojo.getAge());
			System.out.println("Email :"+pojo.getEmail());
		}
		
	}

	public void studentRetriveData() {
		// TODO Auto-generated method stub
		System.out.println("**Retrive the student data**");
		System.out.println("enter the regno:");
		Scanner scanner = new Scanner(System.in);
		int regno= scanner.nextInt();
		for(StudentPojo pojo : StudentCreation.studentdata) {
			if(regno== pojo.getRegno()) {
			System.out.println();
			System.out.println("Regno :"+pojo.getRegno());
			System.out.println("Name  :"+pojo.getName());
			System.out.println("age   :"+pojo.getAge());
			System.out.println("Email :"+pojo.getEmail());
			}
			else
				System.out.println("no records found!!!");
		}
	}

	public void RemoveTheElement() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the remove element:");
		int regno= scanner.nextInt();
		int i=0;
		for(StudentPojo pojo : StudentCreation.studentdata) {
			i++;
			if(i==regno)
			{
				StudentCreation.studentdata.remove(i);
			}
			
		}
		
	}

	public void studentDetailsUpdate() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the search element index:");
	int search = scanner.nextInt();
	for(StudentPojo pojo : StudentCreation.studentdata)
	{
		if(search == pojo.getRegno())
		{
			System.out.println();
			System.out.println("Regno :"+pojo.getRegno());
			System.out.println("Name  :"+pojo.getName());
			System.out.println("age   :"+pojo.getAge());
			System.out.println("Email :"+pojo.getEmail());
		}
		else
			System.out.println("invalid!!!");
	}
	}

	public void copyLinkedList() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("---Student details copy arrayList---");
		System.out.println();
	    studentdata1.addAll(StudentCreation.studentdata);	
	    for(StudentPojo pojo : StudentViewer.studentdata1) {
			System.out.println();
			System.out.println("Regno :"+pojo.getRegno());
			System.out.println("Name  :"+pojo.getName());
			System.out.println("age   :"+pojo.getAge());
			System.out.println("Email :"+pojo.getEmail());
		}
	  
	}

	

}
