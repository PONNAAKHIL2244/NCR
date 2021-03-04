package program;

import java.util.Scanner;

public class Sumofnum {
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num :");
		int num=sc.nextInt();
	int sum=0,rem;
	while(num!=0)
	{
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
	}
	System.out.println("sum is "+sum);
	sc.close();
	}
}
