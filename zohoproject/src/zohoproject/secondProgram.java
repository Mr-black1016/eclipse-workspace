package zohoproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class secondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		LinkedHashMap<Integer, Integer> hashMap=new LinkedHashMap<Integer, Integer>();
		System.out.println("Enter the size of an array");
		int length=scanner.nextInt();
		int arr[]=new int[length];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		int sum=0;
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<length;i++) {
			sum=perfectSquareChecker(arr[i])+divisibleChecker(arr[i])+evenChecker(arr[i]);
			hashMap.put(arr[i], sum);
			if(!arr1.contains(sum)) {
				arr1.add(sum);
			}
			
		}
		Collections.sort(arr1,Collections.reverseOrder());
		for(int i=0;i<arr1.size();i++) {
			Iterator<Entry<Integer, Integer>>  iterator=hashMap.entrySet().iterator();
			while(iterator.hasNext()) {
				Entry<Integer, Integer> entry=iterator.next();
				if(arr1.get(i) == entry.getValue()) {
					System.out.print("<"+entry.getKey()+" "+entry.getValue()+">"+" ");
					
				}
			}
		}
		scanner.close();
		
	}

	private static int evenChecker(int i) {
		
		if(i % 2 == 0) {
			return 3;
		}
		else{
			return 0;
		}
		
	}

	private static int divisibleChecker(int i) {
		
		if(i % 4 == 0 && i % 6 == 0) {
			return 4;
		}
		else {
			return 0;
		}
		
	}

	private static int perfectSquareChecker(int i) {
		
		double squareRoot=Math.sqrt(i);
		if(squareRoot - Math.floor(Math.sqrt(i)) == 0) {
			return 5;
		}
		else {
			return 0;
		}

	}

}
