import java.util.Scanner;

public class SumOfNaturalNumber {
	static int sum=0;
	static int sum(int n)
	{
		while(n>0)
		{	
			sum=sum + n;
			n--;
		}
		return sum;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Integer Number");
		System.out.println("Entered Natural Number Sum is "+sum(sc.nextInt()));
	}
}
