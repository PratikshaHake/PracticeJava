package interviewQuestion;

public class FindSecondMax {
	public static void main(String arg[])
	{
		int arr[]= {11,78,566,9000,5666,100};
		int max=arr[0];
		int secondMax=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax=max;
				max=arr[i];
			}else if(secondMax<arr[i])
			{
				secondMax=arr[i];
			}
		}
	
		System.out.println(secondMax);
	}

}
