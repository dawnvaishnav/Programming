import java.util.Scanner;

public class AverageOfDigit {

	static int  average(int n)
	{
		int count=0;
		int avg=0; 
		while(n>0)
		{
			avg=avg+(n%10);
			n=n/10;
			count++;
		}

		avg=avg/count;
		return avg;		
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number of interger digits");
		System.out.println("Average of the number you entered "+average(sc.nextInt()));
	}
}
