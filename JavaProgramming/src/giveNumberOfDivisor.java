import java.util.Scanner;

public class giveNumberOfDivisor {

	static int  getNumberDivisor(int n)
	{
		if(n==1)
			return 1;
		
		int count=2;
		int i=2;
		
		while(i<=n/2)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter any integer number");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		System.out.println(getNumberDivisor(c));
	
	}

}
