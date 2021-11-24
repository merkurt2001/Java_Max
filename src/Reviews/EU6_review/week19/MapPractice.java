package Reviews.EU6_review.week19;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
	
	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Selda", 100000);
		hashMap.put("Suleyman", 95000);
		hashMap.put("Fatih", 105000);
		hashMap.put("Selda", 110000);
		hashMap.put("Selda", 120000);
		hashMap.put("Selda", 115000);
		hashMap.put("Selda", 111000);
		hashMap.put(null, null);
		
		System.out.println(hashMap);
		
		System.out.println("--------------------------------------");
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Selda", 100000);
		linkedHashMap.put("Suleyman", 95000);
		linkedHashMap.put("Fatih", 105000);
		linkedHashMap.put("Selda", 110000);
		linkedHashMap.put("Selda", 120000);
		linkedHashMap.put("Selda", 115000);
		linkedHashMap.put("Selda", 111000);
		linkedHashMap.put(null, null);
		
		System.out.println(linkedHashMap);
		
		System.out.println("------------------------------------");
		
		
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Selda", 100000);
		treeMap.put("Suleyman", 95000);
		treeMap.put("Fatih", 105000);
		treeMap.put("Selda", 110000);
		treeMap.put("Selda", 120000);
		treeMap.put("Selda", 115000);
		treeMap.put("Selda", 111000);
		//treeMap.put(null, null);  does not accept null
		
		System.out.println(treeMap);
		
		System.out.println("------------------------------------");
		
		
		Map<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("Selda", 100000);
		hashTable.put("Suleyman", 95000);
		hashTable.put("Fatih", 105000);
		hashTable.put("Selda", 110000);
		hashTable.put("Selda", 120000);
		hashTable.put("Selda", 115000);
		hashTable.put("Selda", 111000);
		///hashTable.put(null, null); does not accept null
		
		System.out.println(hashTable);
		
		System.out.println("-----------------------------------");
		// iterating the keys of the map
		
		Map<String, Integer> students = new LinkedHashMap<>();
		students.put("Ali", 80);
		students.put("Fatih", 85);
		students.put("Melike", 90);
		students.put("Selami", 87);
		students.put("Annie", 95);
		
		 for(String key   : students.keySet() ) {
			 System.out.println(key);
		 }
		 
		 System.out.println("------------------------------------");
		// iterating the values of the map
		 
		  for(Integer value : students.values() ) {
			  System.out.println(value);
		  }
		  
		  System.out.println("------------------------------------");
		 // iterating the entries (key & value) of the map
		
		    for(Map.Entry<String, Integer>  entry : students.entrySet() ) {
		    	System.out.println(entry.getKey() +" : "+entry.getValue());
		    }
		    
		   System.out.println("------------------------------");
		   // by using foreach method
		   students.forEach( (k,v) -> {System.out.println(k +" : "+v);}  );
		    
		    
		
		
		
	}

}
