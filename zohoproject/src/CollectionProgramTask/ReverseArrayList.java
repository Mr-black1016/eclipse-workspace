package CollectionProgramTask;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
public static void main(String[] args) {
	ArrayList<String>arrayList = new ArrayList<String>();
	arrayList.add("hi");
	arrayList.add("hello");
	arrayList.add("every");
	arrayList.add("one");
	System.out.println("before reverse:");
	System.out.println(arrayList);
	System.out.println("after reverse");
	Collections.reverse(arrayList);
	System.out.println(arrayList);
}
}
