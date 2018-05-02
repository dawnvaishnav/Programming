import java.util.Scanner;

public class ConvertBinaryToDecimal {
	static int binToDec(int bin)
	{
		int dec=0,c=0;
		do {
			int r=bin%10;
			dec=dec+r*pow(2,c);
			c++;
			bin=bin/10;
		}while(bin!=0);
		return dec;
	}
	
	static int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter any binary value ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Decimal value of your binary value  " + binToDec(sc.nextInt()));
	}
}
