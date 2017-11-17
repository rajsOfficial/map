package map;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap_ComparatorCheck {
    public static void main(String[] args) {
																				// creating tree map 
		   NavigableMap<Integer, String> treemap = new TreeMap<Integer, String>();
   
		   																		// populating tree map
	treemap.put(2, "two");
	treemap.put(1, "one");
	treemap.put(3, "three");
	treemap.put(6, "six");
	treemap.put(5, "five");
   
																				// using comparator
	Comparator comp = treemap.comparator();
	   
	System.out.println("Following natural ordering");
	System.out.println("Comparator value: "+ comp);     
	}    
}