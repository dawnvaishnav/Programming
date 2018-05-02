import java.util.Scanner;

public class ArmStrong {

	static int count(int c) //count the digits
	{
		int count=0;
		while(c>0)
		{
			c=c/10;
			count++;
		}	
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
		
	static	boolean isArmStrong(int n)
	{
		int p=count(n);
		int sum=0;
		int a=n;
		while (a>0)
		{
			int t=a%10;
			sum=sum+power(t,p);
			a=a/10;
		}
		return sum==n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any digit number");
		
		if(isArmStrong(sc.nextInt()))
			System.out.println("Entered number is ArmStrong");
		else
			System.out.println("Entered number is not ArmStrong");
		
		
		
		//System.out.println(power()); //=> To check power method working fine or not .
		//System.out.println(power()); //=> To check power method working fine or not .
	}
}

