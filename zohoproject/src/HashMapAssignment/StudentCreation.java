package HashMapAssignment;

import java.util.HashMap;
import java.util.Scanner;

public class StudentCreation {
	protected static HashMap<Long, HashMapStudent>hashMap = new HashMap<Long ,HashMapStudent>();

	public void Studentcreation() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the student reg no :");
		long regno = scanner.nextLong();
		System.out.println("enter the student name :");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("enter the age :");
		int age = scanner.nextInt();
		System.out.println("enter the student email :");
		scanner.nextLine();
		String email = scanner.nextLine();
		
		HashMapStudent pojo = new HashMapStudent();
		pojo.setStudent(email, name, age);
		
		hashMap.put(regno, pojo);
		
	}

}
