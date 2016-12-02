class GrtNum
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter three number :");
		int a = Integer.parseInt(System.console().readLine());
		int b = Integer.parseInt(System.console().readLine());
		int c = Integer.parseInt(System.console().readLine());
		
		if(a>=b && a>=c) 
		{
		System.out.println("Largest number: "+a);
		}
		if(b>=a && b>=c) 
		{
		System.out.println("Largest number: "+b);
		}
		if(c>=a && c>=b) 
		{
		System.out.println("Largest number: "+c);
		}
	}
} 