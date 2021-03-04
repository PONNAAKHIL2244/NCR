package programs;

import java.util.Scanner;

public class ArrayScanner {
	public static void main(String args)
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}

for(int ele:arr)
{
	System.out.println(ele);
}
sc.close();
	}
}
