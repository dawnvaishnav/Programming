import java.util.Scanner;

public class CovertOctal {

	static String convert(int n)
	{
		String oct ="";
		while(n!=0)
		{
			int r=n%8;
			oct=r+oct;
			n=n/8;	
		}
		
		return oct;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter any integer number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Enterd number convert into binary "+ ""+convert(sc.nextInt()));
	}
}
