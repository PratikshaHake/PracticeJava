package interviewQuestion;

public class PrimeNumber {
	
	public void primeNumber(int no)
	{
		
//		int i,j;
//		for(i=2;i<no;i++)
//		{
			boolean isPrime=true;
			for(int j=2;j<=no/2;j++ ) 
			{
			if(no%j==0) 
			{
				isPrime=false;
				break;
			}
			
		}
			if(isPrime)
			{
				System.out.print(no+" is prime");
			}else
				System.out.print(no+" is not prime");

				
	//}
		
	}
	public static void main(String[] args) {

		PrimeNumber obj=new PrimeNumber();
		obj.primeNumber(2);
		
	}



}
