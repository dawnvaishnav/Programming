import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
	
		if(x/2*2==x)
			System.out.println("The Number "+x+" You Entered is Even Number");
		else
			System.out.println("The Number "+x+ " You Entered is Odd Number");		
	}
}
