package interviewQuestion;

public class Permutation1 {
	
	public void permutation(char arr[],int index)
	{
		if(index==arr.length-1)
		{
			System.out.print(String.valueOf(arr)+" ");
		}
		for(int i=index;i<arr.length;i++)
		{
			char temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			
			permutation(arr,index+1);
		}
	}
	
	public static void main(String[] args) {
		
		Permutation1 obj=new Permutation1();
		String str="ABC";
		obj.permutation(str.toCharArray(), 0);
	}
}
