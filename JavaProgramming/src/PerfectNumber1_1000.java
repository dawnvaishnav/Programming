public class PerfectNumber1_1000 {

	static boolean isPerfect(int x)
	{
		int sum=0;
		int i=1;

		while(i<=x/2)
		{
			if(x%i==0)
				sum=sum+i;
			i++;
		}
		return sum==x;
	}
	
	public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=1000;i++)
	{
		if(isPerfect(i))
		{
			System.out.println(i);
			count++;
		}
	}
	System.out.println("In One to OneThousand Count of PerfectNumbers "+count);
}
}
