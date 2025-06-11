package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> hMap=new HashMap<Integer, String>();
		
		
		System.out.println(hMap.size());  // 0
		
		hMap.put(100, "Ravi");
		
		hMap.put(101, "Gopi");
		
		hMap.put(102, "Kiran");
		
		hMap.put(103, "Mahesh");
		
		System.out.println(hMap.size());
		
		System.out.println(hMap);
		 

	}

}
