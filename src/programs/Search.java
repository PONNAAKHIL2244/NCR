package programs;

import java.util.Scanner;

public class Search {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key to search :");
		int key=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<arr.length;i++)
			{
			if(arr[i]==key)
			{
				System.out.println("found at loc "+i);
				found=true;
				break;
			}
			}
		if(!found)
		{
			System.out.println("element not found");
		}
		sc.close();
	}
}
