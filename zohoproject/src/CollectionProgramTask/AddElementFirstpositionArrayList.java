package CollectionProgramTask;

import java.util.ArrayList;

public class AddElementFirstpositionArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("CRM");
		arrayList.add("Zoho meeting");
		arrayList.add("zoho backstage");
		System.out.println("before insert the element list:");
		System.out.println(arrayList);
		arrayList.add(0,"zoho office");
		System.out.println("after insert the element list");
		System.out.println(arrayList);
	}

}
