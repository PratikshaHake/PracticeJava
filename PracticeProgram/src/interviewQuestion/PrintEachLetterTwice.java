package interviewQuestion;

public class PrintEachLetterTwice {

	public static void main(String arg[])
	{
		String str="pratiksha";
		
		for(int i=0;i<str.length();i++) {
			System.out.print(String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i)));
		}
	}
}
