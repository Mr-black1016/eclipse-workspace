package zohoproject;

import java.util.Scanner;

public class Student {


	private void flowManager() {
		Scanner scanner = new Scanner(System.in);
			System.out.println(" ");
			System.out.println("--------------------------");
			System.out.println("student details");
			System.out. println("1.login ");
			System.out.println("2.details");
			System.out.println("3.1exit");
			System.out.println("--------------------------");
			System.out.println("Enter your choice:");
			int userInput = scanner.nextInt();
			boolean isExit = true;
			while(isExit)
			{
				switch(userInput)
				{
				case 1:
					new studentLogin().login();
					break;
				case 2:
					new DataView().SutudentDetails();
				case 3:
					isExit=false;
					break;
				default:
					System.out.println("invalid input....");
			}
	}
	}

	public static void main(String[] args) {
		  new Student().flowManager();
	}
}
