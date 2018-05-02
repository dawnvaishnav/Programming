import java.util.Scanner;

public class Deserium {
		
	static int count(int c) //count the digits
	{
		int count =0;
		while(c>0)
		{
			c=c/10;
			count++;
		}	
		c=count;
		return count;
	}
	
	static int power(int n,int p) //calculates the power
	{
		int pw=1;
		while (p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	
	static boolean isDeserium(int n)
	{
		int a=n;
		int sum=0;
		int c=count(a);		
		while(a>0)
		{
			int t=a%10;
			sum=sum+power(t,c);
			a=a/10;
			c--;			
		}
		return sum==n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter any integer digit value");
		Scanner sc=new Scanner(System.in);
		if(isDeserium(sc.nextInt()))
			System.out.println("Entered number is diserium ");
		else
			System.out.println("Entered number is not diserium ");
	}
	
}
