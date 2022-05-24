package CollectionProgramTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentNameSort {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("karuppu");
		arrayList.add("kanna");
		arrayList.add("robbin");
		arrayList.add("dheena");
		arrayList.add("raja");
		arrayList.add("mari");
		System.out.println("before sort the element");
		System.out.println();
		System.out.println(arrayList);
		System.out.println("after sort the element:");
		System.out.println();
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}  
}
//StudentDetail stud1 = new StudentDetail(103,"karuppu",20,"karuppu1016@gmail.com");
//StudentDetail stud2 = new StudentDetail(101,"kanna",20,"kanna@gmail.com");
//StudentDetail stud3 = new StudentDetail(104,"robbin",60,"robbin@gmail.com");
//StudentDetail stud4 = new StudentDetail(102,"dheena",80,"dheena@gmail.com");	
//  ArrayList<StudentDetail> array = new ArrayList<StudentDetail>();
//  array.add(stud1);
//  array.add(stud2);
//  array.add(stud3);
//  array.add(stud4);
//  
//  Iterator iterator = array.iterator();
//  while(iterator.hasNext()) {
//	  StudentDetail str = (StudentDetail)iterator.next();
//	  System.out.println("regno: "+str.regno+" "+"Name: "+str.name+" "+"age: "+str.age+" "+"email: "+str.email);
//};
//