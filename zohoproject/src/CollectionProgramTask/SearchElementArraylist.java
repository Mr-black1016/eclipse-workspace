package CollectionProgramTask;

import java.util.ArrayList;

public class SearchElementArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		if(arrayList.contains(20))
		System.out.println("found the elemment");
		else
		System.out.println("element not found");
		}
}
