package CollectionProgramTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
		
public class UpdateSpecificElementArraylist {
		public static void main(String[] args) {
			ArrayList<String>arrayList= new ArrayList<String>();
			arrayList.add("google");
			arrayList.add("bing");
			arrayList.add("duckduckgo");
			System.out.println("before update");
			System.out.println();
			System.out.println(arrayList);
			System.out.println("after update the specific element in the arraylist:");
			arrayList.set(1,"whatsapp");
			System.out.println();
			System.out.println(arrayList);

	}

}
//long regno;
//String name;
//int age;
//long mobno;
//HashMap<long,updatestudent> is = new HashMap<long,updatestudent>(); 
//
//// TODO Auto-generated method stub
//Scanner scanner = new Scanner(System.in);
//System.out.println("your regno:");
//regno=scanner.nextInt();
//System.out.println("enter your name:");
//name = scanner.nextLine();
//System.out.println("enter your age:");
//age= scanner.nextInt();
//System.out.println("enter your mobno:");
//mobno=scanner.nextLong();