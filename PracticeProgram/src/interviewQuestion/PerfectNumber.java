package interviewQuestion;

public class PerfectNumber {
	
	public static void main(String arg[])
	{
		int no=28;
		int sum=0;
		
	 for(int i=1;i<no;i++)
	 {
		 if(no%i==0)
		 {
			 sum+=i;
		 }
	 }
	 
	 if(no==sum)
	
		 System.out.println(no+" is perfect number");
	 else
		 System.out.println(no+" is not a perfect number");

		
	}

}
