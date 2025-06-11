package stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOfCharInStringUsingMap {
	
	public static void main(String[] args) {
		
		toFindOccuranceOfCharactersInString("Hello");
		
	}

	private static void toFindOccuranceOfCharactersInString(String str) {
		
		str=str.toLowerCase();
		char[] chars=str.toCharArray();
	  
		Map<Character, Integer> hMap=new HashMap<Character, Integer>();
		
		for(char ch:chars)
		{
			if(hMap.containsKey(ch))
			{
			hMap.put(ch, hMap.get(ch)+1);
			}
			else
			{
				hMap.put(ch, 1);
			}
			
		}
		
		System.out.println(hMap);
		
		Set<Entry<Character, Integer>> entries=hMap.entrySet();
		
		for(Entry<Character, Integer> entry:entries)
		{
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
		
		
		
	}

}
