package zohoproject;

import java.util.ArrayList;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of :");
		int sizeofarray = in.nextInt();
		System.out.println("array elements:");
		for(int i=0;i<sizeofarray;i++) {
			arrayList.add(in.nextInt());
		}
		int j=0;
		for(int i =0;i<arrayList.size()-1;i++)
		{
			//minValue=i;
			for(j=i+1;j<arrayList.size();j++)
			{
				if(arrayList.get(i) > arrayList.get(j) )
				{
					int temp = arrayList.get(j);
					arrayList.set(j,arrayList.get(i));
					arrayList.set(i,temp);			
				}
			}
		}
		System.out.println(arrayList);
		in.close();
	}

}
