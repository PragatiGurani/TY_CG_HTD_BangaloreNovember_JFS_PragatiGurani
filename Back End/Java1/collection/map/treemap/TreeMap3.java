//arrayList to tree passing
package com.capg.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 
{
  public static void main(String[] args) 
  {
	  ArrayList<StudTree3> l1 = new ArrayList<StudTree3>();
	  l1.add(new StudTree3(23, "Anu"));
	  l1.add(new StudTree3(17, "Chinnu"));
	  l1.add(new StudTree3(24, "Pallavi"));
	  
	  TreeMap<String, ArrayList<StudTree3> > t1 = new TreeMap<String, ArrayList<StudTree3>>();
	  t1.put("Engineering 1st year",l1);
	  
	  System.out.println(t1.get("Engineering 1st year"));
	  System.out.println("--------------------------------");
	  //System.out.println(t1.get("Engineering 1st year")); //get the value from tree
	  
	  Set<Map.Entry<String, ArrayList<StudTree3>>> s1 = t1.entrySet(); 
		
		for(Map.Entry<String, ArrayList<StudTree3> > e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------------------------");
		}
  }
}
