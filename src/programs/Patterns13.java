package programs;

public class Patterns13 {
	public static void main(String args[])
	{
		int i,j,k=1;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				
				System.out.print(k++%2);
			}
			System.out.println();
		}
	}
}
