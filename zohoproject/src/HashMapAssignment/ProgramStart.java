package HashMapAssignment;

import java.util.Scanner;

public class ProgramStart {
	private static void flowManager() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean isExit=true;
		while(isExit) {
			System.out.println("1.Studentcreation");
			System.out.println("2.Student details view");
			System.out.println("3.Exit");
			byte choice= scanner.nextByte();
			switch(choice)
			{
			case 1:
				new StudentCreation().Studentcreation();
				break;
			case 2:
				new StudentDetails().studentdetails();
				break;
			case 3:
				new StudentDetails().StudentCountView();
			case 10:
				isExit=false;
				System.out.println("Exit");
			}
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramStart.flowManager();
	}

	
}
