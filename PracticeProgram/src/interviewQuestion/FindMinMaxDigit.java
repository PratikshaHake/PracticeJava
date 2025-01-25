package interviewQuestion;

public class FindMinMaxDigit {
	public static void main(String arg[])
	{
		int no=18780;
		int min=9,max=0,last=0;
		
		while(no>0)
		{
			last=no%10;
			if(last>max)
				max=last;
			
			if(last<min)
				min=last;
			
			no=no/10;
		}
		
		System.out.println("minimum digit : "+min);
		System.out.println("maximum digit : "+max);

	}

}
