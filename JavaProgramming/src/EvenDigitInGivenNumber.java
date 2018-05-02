import java.util.Scanner;

public class EvenDigitInGivenNumber {

	static int countEven(int n)
	{
		int count=0;
		while (n>0)
		{
			int x=n%10;
			if((x%2)==0)
				count++;
			n=n/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number of interger digits");
		System.out.println("Even number in the digit is "+countEven(sc.nextInt()));
	}
}
