//Write a program to print duplicate vovels
package interviewQuestion;

import java.util.HashMap;

public class CountVovels {
	public static void main(String arg[])
	{
		String str="pratikshashedage";
		String vovels="aeiou";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(char ch:str.toCharArray())
		{
			if(vovels.indexOf(ch)!=-1)
			{
				hm.put(ch,hm.getOrDefault(ch,0)+1);
			}
		}
		
		hm.forEach((k,v)->
		{
			if(hm.get(k)>1)
			System.out.println(k+" : "+v);
		});
		
//		for(char ch:hm.keySet())
//		{
//			if(hm.get(ch)>1)
//			{
//				System.out.println(ch+" : "+hm.get(ch));
//			}
//		}
	}

}
