package StudyMaterials;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Briyani","chickenFriedRice","IceCream","PaaniPuri","AppleFizz"};
		for(String i: names)
		{
			System.out.println(i);
		}
		Arrays.sort(names);
		System.out.println("after sort in alphabetic array sorting:");
		for(String i: names)
		{
			System.out.println(i);
		}
		Comparator comp = new ComparaetorDemo();
		Arrays.sort(names,comp);
		System.out.println("");
		System.out.println("after sorting comparator the String:");
		System.out.println("--------------------------");
		for(String i: names)
		{
			System.out.println(i);
		}

	}

}
