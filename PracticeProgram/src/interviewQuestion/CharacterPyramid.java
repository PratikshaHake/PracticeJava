package interviewQuestion;

public class CharacterPyramid {
	public static void main(String[] args) {
		char ch='a';
		for(int i=1;i<=5;i++)
		{
			for(int j=6-i;j>1;j--)
			{
				System.out.print(" ");
				
			}
			  
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				
			}
				ch++;
			System.out.println();
		}
		
		
	
}
}
