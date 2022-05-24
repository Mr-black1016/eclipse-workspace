package CollectionProgramTask;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
		public static void main(String[] args) {
			ArrayList<String>arrayList = new ArrayList<String>();
			arrayList.add("everything");
			arrayList.add("happen");
			arrayList.add("for");
			arrayList.add("a");
			arrayList.add("reason");
			System.out.println("before shuffle the list:");
			System.out.println();
			System.out.println(arrayList);
			System.out.println("after shuffle the list:");
			Collections.sort(arrayList);
		    System.out.println(arrayList);		
		}
}
