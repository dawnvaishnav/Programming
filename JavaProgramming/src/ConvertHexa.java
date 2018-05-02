import java.util.Scanner;

public class ConvertHexa {
	static String convert(int n)
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
	
	public static void main(String[] args) {
		System.out.println("Enter any integer number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Enterd number convert into binary "+ ""+convert(sc.nextInt()));
	}
}
