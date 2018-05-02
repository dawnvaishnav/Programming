public class StrongNumber {
	
	static boolean isSttrong(int n)
	{
		int sum=0,t=n;
		do {
			int r=n/10;
			sum=sum+fact(r);
			n=n/10;
		}while(n!=0);
	return sum==t;	
	}
	
	static int fact(int x)
	{
		int fc=1;
		while(x>1)
		{
			fc=fc*x;
			x--;
		}
		return fc;
	}
	
	public static void main(String[] args) {
		
	}
}
