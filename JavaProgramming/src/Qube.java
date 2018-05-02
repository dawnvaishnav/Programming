import java.util.Scanner;

public class Qube {
	static int qubeRoot(int n)
	{
		int i=1,a=1;
		while(a!=n)
		{
			i++;
			a=i*i*i;
			if(a>n)
			{
				System.out.println("Enter Correct Number Which Have A Qube");
				System.exit(0);
			}
		}
		return i;
	}

	public static void main(String[] args) {
		System.out.println("Enter any integer value");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("Entered number qroot is "+qubeRoot(a));	
	}	
}
