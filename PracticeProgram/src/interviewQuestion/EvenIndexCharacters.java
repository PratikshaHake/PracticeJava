package interviewQuestion;

public class EvenIndexCharacters {
	public static void main(String arg[])
	{
		String str="sdfjdgkfnvbhvbvndj";
		
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
				System.out.print(str.charAt(i) +" : "+i+"\t");
			
		}
			
	}

}
