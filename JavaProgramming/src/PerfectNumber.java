import java.util.Scanner;

public class PerfectNumber {

	static boolean isPerfect(int x)
	{
		int sum=0;
		int i=1;

		while(i<=x/2)
		{
			if(x%i==0)
				sum=sum+i;
			i++;
		}

		/* if(sum==x)
			return true;
		else
			return false; */
		return sum==x;
	}

	public static void main(String[] args) {
			

			System.out.println("Enter any integer number");
		Scanner sc=new Scanner(System.in);

		if(isPerfect(sc.nextInt()))
			System.out.println("Entered number is perfect");
		else
			System.out.println("Entered number is not perfect");


	}
}
