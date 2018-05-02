import java.util.Scanner;

public class ReverseNumber_Palindrome {
	static int reverse(int n)
	{
		int rev=0;
		do {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
			}while(n!=0);
		return rev;
	}
	
	static boolean isPalindrome(int n)
	{
		return n==reverse(n);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer number");
		System.out.println("Reverse number which you entered "+reverse(sc.nextInt()));
		
		if(isPalindrome(sc.nextInt()))
			System.out.println("Entered number is Palindrome");
		else
			System.out.println("Entered number is not palindrome");
	}
}
