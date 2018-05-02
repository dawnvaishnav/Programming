import java.util.Scanner;

public class SumOfEvenDigit {

	static int sumEven(int n)
	{
		int count=0;
		int sum=0;
		while (n>0)
		{
			int x=n%10;
			if((x%2)==0)
			{	
				count++;
				sum=sum+x;
			}	
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number of interger digits");
		System.out.println("Sum of Even number in the digit is "+sumEven(sc.nextInt()));
	}
}

