//Group the fruits according to length
package interviewQuestion;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupFruitsAsPerLength {

	public static void main(String arg[])
	{
		String arr[]= {"mango","banana","orange","kivi","chikoo","jackfruit","watermelon","apple","papaya"};
		
		HashMap<Integer, ArrayList<String>> fruitgrp=new HashMap<Integer,ArrayList<String>>();
		
		for(String fruit:arr)
		{
			int length=fruit.length();
			if(!fruitgrp.containsKey(length))
			{
				fruitgrp.put(length,new ArrayList<String>());
			}
			fruitgrp.get(length).add(fruit);
		}
		
		
		fruitgrp.forEach((k,v)->{
			System.out.println(k+" : "+v);
			
		});
	}
}

