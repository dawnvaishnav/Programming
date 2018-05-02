import java.util.Scanner;

public class NumberSystem {

	static String convertBinary(int n)
	{
		String hexa ="";
		while(n!=0)
		{
			int r=n%16;
			if(r<10)
				hexa=r+hexa;
			else
				hexa=(char)(r+55)+hexa;
			n=n/16;	
		}
		
		return hexa;
	}
	static String convertOcatal(int n)
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
	
	static String convertHexa(int n)
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
		int a=sc.nextInt();
		System.out.println("Your Enterd number convert into Binary "+convertBinary(a) );
		System.out.println("Your Enterd number convert into Ocatal "+convertOcatal(a));
		System.out.println("Your Enterd number convert into Hexadecimal"+convertHexa(a));
	}
}
