package programs;

public class Hello {
	public static void main(String[] args)
	{
	 java.lang.String s= "HELLO";
		char arr[]= s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		
	{
			for(int j=i;j<arr.length;j++)
			{
				System.out.print(arr[j]+"");
				
			}System.out.println();
		}
	}
}
