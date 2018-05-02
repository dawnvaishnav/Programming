import java.util.Scanner;
public class HappyNumber {

	static boolean happyNumber(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int r=n%10;
				sum=sum+(r*r);
				n=n/10;
			}
		}
		return n==1||n==7;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer number");
		if(happyNumber(sc.nextInt()))
			System.out.println("Entered number is Happy");
		else
			System.out.println("Entered number is not Happy");
	}
}
