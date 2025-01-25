package interviewQuestion;

import java.util.HashMap;

public class PrintDuplicateWordByHashmap {
	
	public static void main(String arg[])
	{
		String str="java programming and java is easy to learn and simple and java java";
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(String word:str.split(" "))
		{
			hm.put(word, hm.getOrDefault(word, 0)+1);
		}
		
		hm.forEach((k,v)->
		{
			if(v>1)
				System.out.println(k+" : "+v);
		});
		
	}

}
