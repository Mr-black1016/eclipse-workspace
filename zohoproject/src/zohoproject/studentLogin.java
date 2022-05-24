package zohoproject;

import java.util.Scanner;

public class studentLogin {
		public void login() {
			Scanner input = new Scanner(System.in);
			System.out.println("--student account creation-----");
			System.out.println("1.account creation");
			System.out.println("2.account delet");
			System.out.println("3.exit");
			System.out.println("enter your choice:");
			int yourChoice = input.nextInt();
			boolean isExits = true;
			while(isExits)
			{
				switch(yourChoice) {
				case 1:
					System.out.println("----Account creation-----");
					System.out.println("Enter the student name:");
					String name = input.nextLine();
					System.out.println("Enter your age:");
					int age= input.nextInt();
					break;
				case 2:
					System.out.println("exit");
					isExits=false;
					default:
						System.out.println("invalid");
				}
			}
			
		}

}
