import java.util.Scanner;

public class ProgramStart {
	private static void flowManger() {
		boolean isExit=true;
		while(isExit) {
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("--student menu--");
			System.out.println();
			System.out.println("1.Add student creation");
			System.out.println("2.view student details");
			System.out.println("3.Insert the student details 0 index");
			System.out.println("4.Retirved a student detail");
			System.out.println("5.update a specfic detail");
			System.out.println("6.Remove the element");
			System.out.println("7.StudentDetailsupdate");
			System.out.println("9.CopyArrayList ");
			System.out.println("10.shuffle a arraylist");
			System.out.println("11.Reverse a arraylist");
			System.out.println("12.extraxt a position in ArrayList");
			System.out.println("13.Compare a one Arraylist to another ArrayList arraylist");
			System.out.println("14.Swap a ArrayList ");
			System.out.println("15.Join a ArrayList");
			System.out.println("16.Clone a ArrayList");
			System.out.println("17.Empty a ArrayList ");
			System.out.println("18.ArrayList Empty or not");
			System.out.println("19.Trim a ArrayList");
			System.out.println("20.");
			System.out.println("22.exit");
			System.out.println();
			System.out.println();
			byte choice= scanner.nextByte();
			switch(choice) {
			case 1:
				 new StudentCreation().student1();
				 break;
			case 2:
				 new StudentViewer().studentdetails1();
				 break;
			case 3:
				new  StudentInsert().studentInsert();
				break;
			case 4:
				new  StudentViewer().studentRetriveData();
				break;
			case 5:
				new UpdateSpecficStudentDetails().updatestudentdetails();
				break;
			case 6:
				new StudentViewer().RemoveTheElement();
				break;
			case 7:
				new StudentViewer().studentDetailsUpdate();
				break;
			case 8:
				break;
			case 9:
				new StudentViewer().copyArrayList();
				break;
			case 10:
				new UpdateSpecficStudentDetails().shuffleArrayList();
				break;
			case 11:
				new UpdateSpecficStudentDetails().reverseArrayList();
				break;			
			case 12:
				new UpdateSpecficStudentDetails().ExtractPosition();
				break;
			case 13:
				new UpdateSpecficStudentDetails().compareArrayList();
				break;
			case 14:
				new UpdateSpecficStudentDetails().SwapToArrayList();
				break;
			case 15:
				new UpdateSpecficStudentDetails().JoinTwoArrayList();
				break;
			case 16:
				new UpdateSpecficStudentDetails().CloneArrayList();
				break;
			case 17:
				new UpdateSpecficStudentDetails().EmptyAarrayList();
				break;
			case 18:
				new UpdateSpecficStudentDetails().ArrayListEmptyOrNot();
				break;
			case 19:
				new UpdateSpecficStudentDetails().TrimCapacity();
				break;
			case 20:
				new UpdateSpecficStudentDetails().IncreaseSizeArrayList();
				break;
			case 21:
				new StudentInsert().PrintAllElementPosition();
			case 22:
				System.out.println("exit");
				isExit= false;
				break;
			default:
				System.out.println("invalid option");
			}
			
	}
}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ProgramStart.flowManger();
	}	
}