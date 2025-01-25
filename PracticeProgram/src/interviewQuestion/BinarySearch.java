package interviewQuestion;

public class BinarySearch {
	int binarySearch(int arr[],int no)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]==no)
				return mid;
			if(arr[mid]<no)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		BinarySearch obj=new BinarySearch();
		int i=obj.binarySearch(arr, 26);
		if(i!=-1) {
			System.out.println("number is present in array");
			
		}else
			System.out.println("number is not present in array");
	}
}
