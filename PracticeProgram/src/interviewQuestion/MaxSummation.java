package interviewQuestion;

public class MaxSummation {
	public static void main(String arg[])
	{
		int arr[]= {1,78,40,200,300};
		int maxsum=arr[0]+arr[1];
		
		for(int i=1;i<arr.length-1;i++)
		{
			int sum=arr[i]+arr[i+1];
			if(sum>maxsum)
			{
				maxsum=sum;
			}
		}
		System.out.println(maxsum);
	}

}
