import java.util.Scanner;

public class CountBinaryOne {
	
	static int countSetedBits(int n)
	{
		int count=0;
		while(n!=0)
		{
			int r=n%2;
				if(r==1)
					count++;
			n=n/2;	
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter any integer number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Inside your entered number SetBites are krelel;"+countSetedBits(sc.nextInt()));
	}
}
