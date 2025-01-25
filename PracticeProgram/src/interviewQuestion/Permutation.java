package interviewQuestion;

public class Permutation {
	
	public void swap(char arr[],int index1,int index2)
    {
        char temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
	
    public void solution(char arr[],int index)
    {
    	
        if(index==arr.length-1)
        {
        	
            System.out.print(String.valueOf(arr)+" ");
           
        }
        
        for(int i=index; i<arr.length;i++)
        {
            swap(arr,index,i);
            solution(arr,index+1);
        
        }
      
    }
    public static void main(String[] args) {
    	Permutation obj=new Permutation();
        String str="ABC";
        obj.solution(str.toCharArray(),0);
    }
}
