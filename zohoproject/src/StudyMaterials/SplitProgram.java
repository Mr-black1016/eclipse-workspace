package StudyMaterials;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String NewValue[]=string.split(" ");
		ArrayList<String> arrayList = new ArrayList<String>();
		for(String i : NewValue) {
			System.out.println(i);
		}
		/*
		for(int i=0;i<NewValue.length;i++) {
			
			if(!arrayList.contains(NewValue[i])) {
				arrayList.add(NewValue[i]);
			}
		}
		String s1=String.join(" ", arrayList);
		System.out.println(s1);*/
		}
	

}
// array index 0