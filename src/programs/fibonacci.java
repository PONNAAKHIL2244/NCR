package programs;

import java.util.Scanner;

public class fibonacci {

	public static void main(String args[])
	{
		System.out.println("enter numbers :");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		//System.out.println("1"+"1");
		int a=0,b=1,c;
		for(int i=1;i<=n1;i++)
		{
			System.out.println(a +"\t");
			c=a+b;
			a=b;
			b=c;
			
		}
		sc.close();
}
}
