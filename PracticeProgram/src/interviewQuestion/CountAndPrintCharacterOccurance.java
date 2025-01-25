package interviewQuestion;

import java.util.HashMap;

public class CountAndPrintCharacterOccurance {
	public static void main(String[] args) {
		
		String str="aaabbbbcccdddd";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char ch:str.toCharArray())
		{
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		hm.forEach((k,v)->{
			System.out.print(k+""+v);
		});
		
	}

}
