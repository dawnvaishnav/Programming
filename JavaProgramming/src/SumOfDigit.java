import java.util.Scanner;

public class SumOfDigit {
	
	static int sumOfDigit(int n)
	{
		int sum=0;
		do {
			int r=n%10;
			sum = sum+r;
			n=n/10;
		}while (n!=0);
			return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter any digit of integer number");
		Scanner sc=new Scanner(System.in);
		System.out.println("The sum of Digit you Entered is "+sumOfDigit(sc.nextInt()));
		
	}
}
