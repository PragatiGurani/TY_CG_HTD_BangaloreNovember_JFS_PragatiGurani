package com.capg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1
{
 public static void main(String[] args) 
 {
	 LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
	  l1.put("BTM", 590005);
	  l1.put("BTR", 597905);
	  l1.put("Hebbal", 689005);
	  l1.put("BTR", 597905);
	  l1.put("Rajaji", 839005);
	  l1.put(null, 839005);
	  l1.put(null, null); //it takes lAST NULL BCZ IT doesnt allow duplicate
	  
	  l1.remove("BTR");
	  System.out.println("-------contains----------");
	  System.out.println(l1.containsValue(689005));
	  
	  Set<Map.Entry<String, Integer>> s1 = l1.entrySet();
	  
	  for(Map.Entry<String, Integer> e1 :s1)
	  {
		  System.out.println(e1.getKey());
		  System.out.println(e1.getValue());
		  System.out.println("----------------------");
	  }
 }
 
}
