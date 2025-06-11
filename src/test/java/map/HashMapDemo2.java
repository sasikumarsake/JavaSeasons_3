package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		
		System.out.println(hMap.size());  // 0
		
		hMap.put("Manager", "Ravi");
		
		hMap.put("Test Lead", "Gopi");
		
		hMap.put("Developer", "Kiran");
		
		hMap.put("Product Owner", "Mahesh");
		
		System.out.println(hMap.size());
		
		System.out.println(hMap);
		 
		
		System.out.println(hMap.get("Developer"));
		
		System.out.println(hMap.get("Tester"));
		

	}

}
