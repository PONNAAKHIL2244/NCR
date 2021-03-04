package programs;

import java.util.Scanner;

public class Digitcount {

		public static void main(String args[])
		{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number :");
			int num1=sc.nextInt();
			int digit=0;
			while(num1!=0)
			{
			num1=num1/10;
				digit++;
				
			}
			System.out.println("digit count:"+digit);
			sc.close();
		}
}
