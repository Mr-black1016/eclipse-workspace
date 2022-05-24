package zohoproject;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the array list:");
		int SizeofList = in.nextInt();
		System.out.println("array elements:");
		for(int i=0;i<SizeofList;i++)
		{
			arrayList.add(in.nextInt());
		}
		int minValue=0;
		int i=0;
		int j=0;
		for( i =0;i<arrayList.size()-1;i++)
		{
			minValue=i;
			for( j=i+1;j<arrayList.size();j++)
			{
				if(arrayList.get(minValue)> arrayList.get(j)) {
					minValue=j;
				}
			}
			int temp = arrayList.get(minValue);
			arrayList.set(minValue,arrayList.get(i));
			arrayList.set(i, temp);
		}
		
		System.out.println(arrayList);
		in.close();
	}
}
