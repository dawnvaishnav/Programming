import java.util.Scanner;

public class AnalogAngle {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Hour and Minute");
		int hr=sc.nextInt();
		int min=sc.nextInt();
		
		double hAngle = hr*30+min*0.5;
		double mAngle = min*6;
		double angle=0.0;
		
		if(hAngle > mAngle)
			angle=hAngle-mAngle;
		else
			angle=mAngle-hAngle;
		
	if(angle>180)
		angle=360-angle;
	System.out.println("Least angle between the " +hr+" and "+min+" minute is " +angle );
		
	}
}
