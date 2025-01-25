//Remove duplicate characters from string
package interviewQuestion;

import java.util.LinkedHashSet;

public class DistintictCharcters {
	public static void main(String arg[])
	{
		String str="Sssiimple";
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for(char ch: str.toLowerCase().toCharArray())
		{
			hs.add(ch);
		}
		
		System.out.println(hs);
		
		for(Object obj:hs)
		{
			System.out.print(obj);
		}
	}

}
