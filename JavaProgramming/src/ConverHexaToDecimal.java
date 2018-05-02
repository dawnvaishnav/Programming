import java.util.Scanner;

public class ConverHexaToDecimal {

	static int hexaToDec(String st)
	{
		int dec=0,c=0,i=0;
		for(i=st.length()-1;i>=0;i--)
		{
			char ch=st.charAt(i);
				if(ch>='A'&& ch<='F')
				{
					dec=dec+(ch-55)*pow(16,c);
				}
				else if(ch>='a'&&ch<='f')
				{
					dec=dec+(ch-87)*pow(16,c);
				}
				else
				{
					dec=dec+(ch-48)*pow(16,c);
				}
				c++;	
		}return dec;
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
		
		System.out.println("Enter any Hexa Decimal value ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Decimal value of your HexaDecimal value  " + hexaToDec(sc.nextLine()));
	}
}
