package interviewQuestion;

public class PrintDuplicateWord {
	public static void main(String arg[])
	{
		String str="java programming and java is easy to learn and simple and java java";
		String word[]=str.split(" ");
		int count=0;
		
		for(int i=0;i<word.length;i++)
		{
			count=1;
			for(int j=i+1;j<word.length-1;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
					word[j]="O";
				}
			}
			
			if(count>1 && word[i]!="O")
			{
				System.out.println(word[i]);
			}
		}
		
		
	}

}
