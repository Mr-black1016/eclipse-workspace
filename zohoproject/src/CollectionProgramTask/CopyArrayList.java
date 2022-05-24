package CollectionProgramTask;

import java.util.ArrayList;

public class CopyArrayList {
	public static void main(String[] args) {
		ArrayList<Integer>arrayList = new ArrayList<Integer>();
		arrayList.add(14);
		arrayList.add(23);
		arrayList.add(54);
		arrayList.add(67);
		arrayList.add(67);
		arrayList.add(37);
		System.out.println("first array list:");
		System.out.println(arrayList);
		ArrayList<Integer>arrayList2 = arrayList;
		System.out.println("after copy array list one arraylist:");
		System.out.println(arrayList2);

	}

}
