package programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		System.out.println("enter number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
int temp=n,r,rev = 0;;
while(n!=0)
{
	 r=n%10;
	 rev=rev*10+r;
	 n=n/10;
	
}
if(rev==temp)

	System.out.println("palindrome");

else
	
	System.out.println("not a palindrome");
sc.close();
	}
}
