import java.util.Scanner;

public class ConvertInBinary {
	static String convert(int n)
	{
		String bin ="";
		while(n!=0)
		{
			int r=n%2;
			bin=r+bin;
			n=n/2;	
		}
		
		return bin;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter any integer number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Enterd number convert into binary "+ ""+convert(sc.nextInt()));
	}
}
