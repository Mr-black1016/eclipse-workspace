package CollectionProgramTask;

import java.util.ArrayList;

public class RetriveElementArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(10);
			arrayList.add(20);
			arrayList.add(30);
			arrayList.add(40);
			arrayList.add(50);
			arrayList.add(60);
			System.out.println(arrayList);
			System.out.println("retrive the specific element:");
			System.out.println(arrayList.get(3));	
			
	}

}
