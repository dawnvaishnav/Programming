import java.util.Scanner;

public class Power {

	static int  pow(int n,int p)
	{
		int sum=1;
		do {
			sum=sum*n;
			p--;		
		}while(p!=0);
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter any the number & power ");
		Scanner sc=new Scanner(System.in);
		System.out.println("the power of the number you entered is "+ pow(sc.nextInt(),sc.nextInt()));
	}
	
}
