
public class Armstrong {
	
		public static void main(String[] args)
		{
		int i=153,j;
		
		j=armstrongOrNot(i);
		if(j==i) {
		System.out.println("No. "+ i +" is Armstrong");
		}else
			System.out.println("No. is not Armstrong");
		}
		
	static int armstrongOrNot(int num)
	{
		int x,a=0;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num/=10 ;
		}
		return a;
	}
	}

