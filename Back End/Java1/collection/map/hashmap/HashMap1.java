package com.capg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 
{
  public static void main(String[] args) 
  {
	  HashMap<Integer, String> h1 = new HashMap<Integer, String>();
	  h1.put(10, "Suresh");
	  h1.put(40, "ganesh");
	  h1.put(20, "dinesh");
	  h1.put(30, "Anu");
	  
	  Set<Map.Entry<Integer, String>> s1 = h1.entrySet();
	  System.out.println("---------remove----------");
	  h1.remove(40);
	  System.out.println(h1);
	  
	  for(Map.Entry<Integer, String> e1 :s1)
	  {
		  System.out.println(e1.getKey());
		  System.out.println(e1.getValue());
	  }
	  System.out.println("-----contains------");
	  System.out.println(h1.containsKey(40));
	  System.out.println("---------get----------");
	  System.out.println(h1.get(20));
	  
	  System.out.println("---------for only key----------");
	  Collection<Integer> i1 = h1.keySet();
	  for(Integer i2 : i1)
	  {
		  System.out.println(i2);
	  } 
	  
	  System.out.println("---------for only values----------");
	  Collection<String> c1 = h1.values();
	  
	  for(String s2 : c1)
	  {
		  System.out.println(s2);
	  }

  }
}
