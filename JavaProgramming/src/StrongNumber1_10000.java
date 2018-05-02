public class StrongNumber1_10000 
{

	static boolean isStrong(int n)
	{

		int k=n;
		int sum=0;

		while(n>0)
		{
			int x=n%10;
			int fact=1;
			while(x>0)
			{
				fact=fact*x;
				x--;
			}
			sum=sum+fact;
			n=n/10;
		}
		return k==sum;
	}

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10000;i++)
		{
			if(isStrong(i))
			{	
				System.out.println(i+"");
				count++;
			}
		}
		System.out.println("In one to TenThousand Count of Strong Numbers are "+count);
	}

}
