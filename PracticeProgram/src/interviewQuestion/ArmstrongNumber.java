package interviewQuestion;

public class ArmstrongNumber {
	public static void main(String arg[])
	{
		int no=160;
		int temp=no,digits=0,sum=0,lastDigit=0;
		
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp=no;
		while(temp>0)
		{
			lastDigit=temp%10;
			sum+=(Math.pow(lastDigit,digits));
			temp=temp/10;
			
		}
		
		if(sum==no)
		{
			System.out.println(no+" is Armstrong");
		}else
		{
			System.out.println(no+" is not Armstrong");
		}
	}

}
