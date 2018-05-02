import java.util.Scanner;

public class Prime 
{
	static boolean isPrime(int a)
	{
		int i=2;
		while(i<=a/2)
		{
			if(a%i==0)
			{
				return false;
			}	
			i++;
		}	
		return true;
	}	
	// or same 
	static int prime(int a)
	{
		int i=2;
		while(i<=a/2)
		{
			if(a%i==0)
			{return 1;}	
			
			i++;
		}	
		return 0;
	}
		
	public static void main(String[] args) 
	{

		System.out.println("Enter any integer number");
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		if(isPrime(n))
			System.out.println("Entered number "+ n +" is Prime number");
		else
			System.out.println("Entered number "+ n +" is not Prime number");
		
		String st[]= {"Entered number "+ n +" is Prime number","Entered number "+ n +" is not Prime number"};
		System.out.println(st[prime(n)]+"Result Without If Condition ");
	}

}
