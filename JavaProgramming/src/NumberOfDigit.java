import java.util.Scanner;

public class NumberOfDigit {
	
	static int getNumberOfDigit(int n)
	{
		int dc=0;
		do 
		{
		 dc++;
		 n=n/10;
		}
		while(n!=0);
		return dc;
	}
	public static void main(String[] args) {
		System.out.println("Enter any number of Digit values");
		Scanner sc=new Scanner(System.in);
		int dc=getNumberOfDigit(sc.nextInt());
		System.out.println("The digit of Numbers you entered is "+dc);
	}

}
