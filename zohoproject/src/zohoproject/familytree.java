package zohoproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class familytree {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		HashMap<String ,String> hashMap= new HashMap<String,String>();
		hashMap.put("luke","shaw");
		hashMap.put("wayne","rooney");
		hashMap.put("rooney","ronaldo");
		hashMap.put("shaw","rooney");
		hashMap.put("luke","shaw");
		
		String sonName=null;
		
		Iterator<Entry<String, String>>iterator= hashMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String,String> entry= iterator.next();
			if("ronaldo".equalsIgnoreCase(entry.getValue())) {
				sonName=entry.getKey();
				break; 
			}
		}
		int count=0;

		Iterator<Entry<String, String>>iterator1= hashMap.entrySet().iterator();
		while(iterator1.hasNext()) {
			Entry<String,String> entry= iterator1.next();
			if(sonName.equalsIgnoreCase(entry.getValue())) {
				count++;
				
			}
		}
		System.out.println(count);
	}
	

}
