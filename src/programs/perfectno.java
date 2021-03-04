package programs;

import java.util.Scanner;

public class perfectno {
	public static void main(String args[])
	{
		System.out.println("enter limit num :");
		Scanner sc=new Scanner(System.in);
int limit=sc.nextInt();
System.out.println("enter num :");
		int n2=sc.nextInt();
		
		for(n2=1;n2<=limit;n2++)
		{
	int sum=0;;
	for(int i=1;i<=n2/2;i++)
	{
		if(n2%i==0)
			{
			sum=sum+i;
			}
	}
	
	if(sum==n2)
	{	
	System.out.println(n2 +" "+ "perfect");
	
		}
		}
	sc.close();
}
}