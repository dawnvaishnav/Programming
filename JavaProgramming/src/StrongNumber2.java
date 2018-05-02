import java.util.Scanner;

public class StrongNumber2 {

	static boolean isStrong(int n)
	{
		
		int k=n;
		int sum=0;
		
		while(n>0)
		{
			int x=n%10;
			int fact=1;
			 while(x>0)
			 {
				 fact=fact*x;
				 x--;
			 }
			 sum=sum+fact;
			 n=n/10;
		}
		return k==sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer number");
		if(isStrong(sc.nextInt()))
			System.out.println("Entered number is Strong");
		else 
			System.out.println("Entered number is not Strong");
	}
}
