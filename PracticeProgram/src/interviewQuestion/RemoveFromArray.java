package interviewQuestion;

import java.util.LinkedHashSet;

public class RemoveFromArray {
	public static void main(String arg[])
	{
		int arr[]= {10,70,10,20,30,11,10,30,40,10};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		System.out.println(set);
	}

}
