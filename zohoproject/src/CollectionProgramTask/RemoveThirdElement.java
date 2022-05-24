package CollectionProgramTask;

import java.util.ArrayList;

public class RemoveThirdElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arrayList = new ArrayList<>();
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("four");
		arrayList.add("five");
		System.out.println(arrayList);
		System.out.println(arrayList.remove(3));
		System.out.println("after remove the third element");
		System.out.println(arrayList);
	}
}
