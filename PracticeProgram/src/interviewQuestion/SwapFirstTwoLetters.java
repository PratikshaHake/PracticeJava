package interviewQuestion;

public class SwapFirstTwoLetters {

	public static void main(String[] args) {

		String str="JAVA";
		str=str.charAt(str.length()-1)+str.substring(0, str.length()-1);
		System.out.println(str);
	}

}
