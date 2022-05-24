package zohoproject;

import java.util.Scanner;

public class thirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String n = in.next();
		
		if(n.length() % 2 !=0) {
			for(int i =0;i<n.length();i++)
			{
				int j=n.length()-i-1;
				for(int k=0;k<n.length();k++)
				{
					if(k==i || k==j)
					{
						System.out.print(n.charAt(k));
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println(" ");
			}
		}
		System.out.println("x pattern is impossible");
	}

}
