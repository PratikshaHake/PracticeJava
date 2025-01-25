//print duplicate consonant
package interviewQuestion;

import java.util.HashMap;

public class ConsonentOccurance {
	public static void main(String arg[]) {
		
		String str="pratikshashedagecjfdkhgkgjdflghlkfbvckbjgkfgbjgfkb";
		str=str.replaceAll("[aeio]","");
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(char ch:str.toCharArray())
		{
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		hm.forEach((k,v)->
		{
			if(hm.get(k)>1)
			System.out.println(k+" : "+v);
		});
		
	}

}
