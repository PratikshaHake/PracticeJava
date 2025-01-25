package interviewQuestion;

import java.util.HashMap;

public class Anagram {
	public boolean isAnagram(String str1,String str2)
	{
	
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	
		
		for(char c:str1.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0)+1);
			
//			if(hm.containsKey(c))
//			{
//				hm.put(c, hm.get(c)+1);
//			}
//			else
//			{
//				hm.put(c, 1);
//			}
		}
		
		for(char c:str2.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0)-1);
			
//			if(hm.containsKey(c))
//			{
//				hm.put(c, hm.get(c)-1);
//			}
//			else
//			{
//				hm.put(c, 1);
//			}
		}
		
	
		
	    for(HashMap.Entry<Character,Integer> entry : hm.entrySet())
		{
			if(entry.getValue()!=0)
			{
				return false;
			}
			
		}
		return true;
		
	}
	public static void main(String arg[])
	{
		String str1="listen";
		String str2="silent";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		Anagram an=new Anagram();
		boolean b=an.isAnagram(str1, str2);
		System.out.println(b);
				
		
		
	}



}
