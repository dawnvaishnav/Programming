import java.util.Scanner;

public class PrimeNumber1_100 {
	static boolean isPrime(int a)
	{
		int i=2;
		while(i<=a/2)
		{
			if(a%i==0)
			{return false;}	
			
			i++;
		}	
		return true;
	}
	
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(isPrime(i))
			{	
				System.out.println(i);
				count++;
			}	
		}
		System.out.println("In one to Hundred Count of Prime Numbers are "+count);
	}
	
}	